package secondTry.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = {0,1,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums){
        if(nums.length==0)
            return 0;
        int current =0;
        for(int x=0;x<nums.length;x++){
            if(nums[x]!=nums[current]){
                current++;
                nums[current]=nums[x];
            }
        }
        return current+1;
    }
}
