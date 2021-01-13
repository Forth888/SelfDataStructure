package secondTry.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String b = "abc";

        FindAnagrams find = new FindAnagrams();
        List<Integer> res = find.findAnagrams(s,b);
        System.out.println(res);
    }

    public List<Integer> findAnagrams(String s, String p){
        List<Integer> ans = new ArrayList<>();
        if(s == null || p == null)
            return ans;
        int[] contioned = new int[256];
        for(int x=0;x<p.length();x++){
            contioned[p.charAt(x)-'a'] += 1;
        }

        int[] need = new int[256];
        int low = 0, high = 0;
        int count=0;
        while(low<=high && high <s.length()){
            char currentChar = s.charAt(high);
            need[currentChar-'a']++;
            while(need[currentChar-'a'] > contioned[currentChar-'a']){
                need[s.charAt(low)-'a']--;
                low++;
            }
            //这时候 为e count是够了，但是还需要其他判断条件

            if((high-low+1)==p.length() && need[currentChar-'a'] == contioned[currentChar-'a']){
                ans.add(low);
            }
            high++;

        }
        return ans;
    }

}
