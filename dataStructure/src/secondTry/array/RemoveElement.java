package secondTry.array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] agrs){
        int[] nums = {2};
        removeElement2(nums,3);
    }

    public static int removeElement(int[] nums, int val){
        if(nums.length==0)
            return nums.length;
        int current = 0;
        int end = 0;
        a:for(int x=0;x<nums.length;x++){
            while(nums[x]==val && x<nums.length){
                x++;
                if(x>nums.length || x==nums.length) {
                    x--;
                    break a;
                }
            }
            nums[current]=nums[x];
            current++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(current);
        return current;
    }

    public static int removeElement2(int[] nums, int val){
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

}
