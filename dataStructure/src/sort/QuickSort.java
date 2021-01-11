package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {30,40,60,10,20,50,30};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] nums,int left,int right){
        if(left<right){
            int p = preSort(nums,left,right);
            quickSort(nums,left,p-1);
            quickSort(nums,p+1,right);
        }
    }

    public static int preSort(int[] nums, int left,int right){
        int randomIndex = (int)(Math.random()*(right-left))+left;
        swap(nums,randomIndex,right);
        return sort(nums,left,right);
    }

    public static int sort(int[] nums,int left,int right){
        int basicNum = nums[right];
        int mv = left-1;
        for(int x=left;x<right;x++){
            if(nums[x]<=basicNum){
                swap(nums,++mv,x);
            }
        }
        swap(nums,mv+1,right);
        return mv+1;
    }

    public static void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}
