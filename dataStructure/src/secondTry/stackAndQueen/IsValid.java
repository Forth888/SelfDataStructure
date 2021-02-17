package secondTry.stackAndQueen;

import java.util.HashMap;
import java.util.Stack;

public class IsValid {

    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                if(stack.isEmpty() || map.get(ch)!= stack.peek())
                    return false;
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
