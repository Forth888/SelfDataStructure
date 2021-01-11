package secondTry.array;

public class MinSubArrayLen {

    public static void main(String[] args) {
        int nums[] = {1,1};
        int s =3;
        MinSubArrayLen ms = new MinSubArrayLen();
        int res = ms.minSubArrayLen(s,nums);
        System.out.println(res);
    }

    public int minSubArrayLen(int s, int[] nums){
        if(nums.length==0)
            return 0;
        int low = 0, high = 0;
        int sum = 0;
        int resMin=Integer.MAX_VALUE;
        while(low<=high && high <nums.length){
            sum += nums[high];
            while(sum>=s) {
                resMin = Math.min(resMin, high - low+1);
                sum = sum - nums[low];
                low++;
            }
            high++;

        }
        return resMin == Integer.MAX_VALUE?0:resMin;
    }

}
