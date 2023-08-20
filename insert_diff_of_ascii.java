import java.util.*;

public class insert_diff_of_ascii{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.next();
        String newstr = new String();
        for (int i=1 ; i<str.length() ; i++){
            newstr+=str.charAt(i-1);
            newstr+=Math.abs(((int)(str.charAt(i-1))-(int)(str.charAt(i))));
        }
        newstr+=str.charAt((str.length()-1));
        System.out.print(newstr);
    }
}