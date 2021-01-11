package secondTry.array;

public class IsPalindrome {

    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean res = ip.isPalindrome(s);
        System.out.println(res);
    }

    public boolean isPalindrome(String s){
        if(s.isEmpty())
            return true;
        int low = 0;
        int high = s.length()-1;
        while(low <high){
            while(low<high && !(Character.isDigit(s.charAt(low)) || Character.isLetter(s.charAt(low)))){
                low++;
            }
            while(low<high && !(Character.isDigit(s.charAt(high)) || Character.isLetter(s.charAt(high)))){
                high--;
            }
            if(Character.toLowerCase(s.charAt(low))!=Character.toLowerCase(s.charAt(high)))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
