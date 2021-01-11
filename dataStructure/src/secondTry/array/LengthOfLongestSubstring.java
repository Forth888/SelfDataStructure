package secondTry.array;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        LengthOfLongestSubstring lls = new LengthOfLongestSubstring();
        String s = "";
        int res = lls.lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    public int lengthOfLongestSubstring(String s){
//        int[] set = new int[26];
//        int letter = 'a'-'a';
//        for(int x=0;x<set.length;x++){
//            set[letter++]=x;
//        }
        int[] test = new int[256];
        int low =0, high = 0;
        int maxLen = Integer.MIN_VALUE;
        while(low<=high && high<s.length()){
            if(test[s.charAt(high)]!=0){
                test[s.charAt(low)]--;
                low++;
            }else{
                maxLen = Math.max(maxLen,high-low+1);
                test[s.charAt(high)]=1;
                high++;
            }
        }

        return maxLen==Integer.MIN_VALUE?0:maxLen;
    }

}
