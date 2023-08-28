import java.util.*;

public class palindrome{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.next();
        boolean ispal = isPalindrome(str,0);
        if (ispal==true){
            System.out.print("String is a palindrome");
        }
        else{
            System.out.print("String is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str,int index){
        if (index>=str.length()/2){
            return true;
        }
        else if (str.charAt(index)!=str.charAt(str.length()-index-1)){
            return false;
        }
        return isPalindrome(str,index+1);

    }
}