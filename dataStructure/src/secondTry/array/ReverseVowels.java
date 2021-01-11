package secondTry.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {

    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        String s = "aA";
        String res = rv.reverseVowels(s);
        System.out.println(res);
    }

    public String reverseVowels(String s){
        int low = 0, high = s.length()-1;
        char[] charS = s.toCharArray();
        while(low<high){
            while(low<high && !isVowels(charS[low])){
                low++;
            }
            while(low<high && !isVowels(charS[high])){
                high--;
            }
            if(isVowels(charS[low]) && isVowels(charS[high])){
                char temp = charS[low];
                charS[low] = charS[high];
                charS[high] = temp;
            }
            low++;
            high--;
        }
        return String.valueOf(charS);
    }
    static char[] vowels = {'a','e','i','o','u'};
    public boolean isVowels(char c){
        for(int i=0;i<vowels.length;i++){
            if(vowels[i]==Character.toLowerCase(c))
                return true;
        }
        return false;
    }

}
