package secondTry.array;

public class MaxArea {

    public static void main(String[] args) {
        MaxArea ma = new MaxArea();
        int[] target = {1,8,6,2,5,4,8,3,7};
        int res = ma.maxArea(target);
        System.out.println(res);
    }

    public int maxArea(int[] target){
        if(target.length==0)
            return 0;
        int low = 0, high = target.length-1;
        int maxAns = 0 ;
        while(low<high){
            int min = Math.min(target[high],target[low]);

            maxAns = Math.max(min*(high-low),maxAns);

            if(target[low] <= target[high])
                ++low;
            else
                --high;
        }

        return maxAns;
    }

}
