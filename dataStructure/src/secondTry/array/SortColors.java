package secondTry.array;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        SortColors sc = new SortColors();
        int[] nums={1,0,2,1,1,0};
        sc.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void sortColors(int[] nums){
        int zero=-1;
        int two = nums.length;
        for(int x = 0;x<two;){
            if(nums[x]==1){
                x++;
            } else if(nums[x]==2){
                two--;
                int temp = nums[two];
                nums[two] = nums[x];
                nums[x] = temp;
            } else{
                assert nums[x]==0;
                zero++;
                int temp = nums[zero];
                nums[zero] = nums[x];
                nums[x] = temp;
                x++;
            }
        }
    }

    public void sortColors2(int[] nums) {
        int zero = -1;// value =0
        int end = nums.length;//value =2;
        for(int i=0;i<end;) {
            if(nums[i]==1)
                i++;
            else if(nums[i]==2) {
                end--;
                int temp= nums[end];
                nums[end]= nums[i];
                nums[i]=temp;
            }else{
                assert nums[i]==0;
                zero++;
                int temp= nums[zero];
                nums[zero]= nums[i];
                nums[i]=temp;
                i++;
            }

        }
    }
}
