package secondTry.array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] numbers={2,7,11,15};
        int target = 9;
        int[] rs = ts.twoSum(numbers,target);
        System.out.println(Arrays.toString(rs));
    }

    public int[] twoSum(int[] numbers, int target){
        int res[] = new int[2];
        if(numbers.length==0)
            return res;
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            if ((numbers[low] + numbers[high])<target) {
                low++;
            }else if((numbers[low] + numbers[high])>target){
                high--;
            }else{
                return new int[]{low+1, high+1};
            }
        }
        return res;
    }
}
