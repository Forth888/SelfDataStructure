package secondTry.array;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        rs.reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public void reverseString(char[] s){
        if(s.length==0)
            return;
        int low = 0, high = s.length-1;
        while(low<high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
}
