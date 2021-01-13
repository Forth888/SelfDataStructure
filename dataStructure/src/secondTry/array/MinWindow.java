package secondTry.array;

public class MinWindow {

    public static void main(String[] args) {

        String s = "a";
        String t = "a";
        MinWindow mw = new MinWindow();
        String res =  mw.minWindow(s,t);
        System.out.println(res);

    }

    public String minWindow(String s, String t) {
        String res = "";
        if(s == null || t == null)
            return res;
        //用来统计t中每个字符出现次数
        int[] needs = new int[128];
        //用来统计滑动窗口中每个字符出现次数
        int[] window = new int[128];

        for (int i = 0; i < t.length(); i++) {
            needs[t.charAt(i)]++;
        }
        int left =0;
        int right =0;
        int count =0;
        int minLength = s.length();
        while(left<=right && right < s.length()){
            char currentChar = s.charAt(right);
            window[currentChar]++;
            if(needs[currentChar]> 0 && needs[currentChar]>=window[currentChar])
                count++;
            while(count==t.length()){
                currentChar = s.charAt(left);
                if(needs[currentChar]> 0 && needs[currentChar]>=window[currentChar])
                    count--;
                if(right-left+1<=minLength){
                    minLength = right-left+1;
                    res = s.substring(left, right + 1);
                }
                window[currentChar]--;
                left++;
            }
            right++;

        }

        return res;
    }
}
