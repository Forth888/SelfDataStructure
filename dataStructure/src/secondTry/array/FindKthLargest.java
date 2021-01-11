package secondTry.array;

import java.util.Arrays;

public class FindKthLargest {

    public static void main(String[] args) {
        FindKthLargest fkl = new FindKthLargest();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int res = fkl.findKthLargest(nums,k);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }

    public int findKthLargest(int[] nums, int k) {
        return randomQuickSort(nums,0,nums.length-1,nums.length-k);
    }

    public int randomQuickSort(int[] nums, int left, int right, int index){
        if(left<right){
            int p = randomPartition(nums,left,right);
            if(p==index)
                return nums[p];
            return p<index?randomQuickSort(nums,p+1,right,index) : randomQuickSort(nums,left,p-1,index);
        }
        return -1;
    }

    public int randomPartition(int[] nums, int left, int right){
        swap(nums,right, ((int)(Math.random()*(right-left)))+left);
        return partition(nums,left,right);
    }

    public int partition(int[] nums, int left, int right){
        int basicNum = nums[right];
        int x = left-1;
        for(int i=left;i<right;i++){
            if(nums[i]<basicNum){
                swap(nums,++x,i);
            }
        }
        swap(nums,x+1,right);
        return x+1;
    }

    public void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
