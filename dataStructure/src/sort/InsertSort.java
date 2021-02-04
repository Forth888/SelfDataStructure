package sort;

import java.util.Arrays;

public class InsertSort {
    /**
     * 插入排序，是把n个带排序元素看成一个有序表和一个无序表
     * 开始的时候有序表包含一个元素，即原元素的第一个元素，而剩下的元素是无序表
     * 排序过程中，每次从无序表中取出一个元素依次与有序元素比较并插入到合适的位置。
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10); // 生成一个[0, 8000000) 数
        }

        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){
        int insertVal = 0;
        int insertIndex = 0;
        for(int i=1;i<arr.length;i++){
            insertVal = arr[i];
            insertIndex = i-1;
            while(insertIndex>=0 && insertVal<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            if(insertIndex+1 != i){
                arr[insertIndex+1] = insertVal;
            }
        }
    }
}
