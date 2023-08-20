import java.util.*;

public class remove_consecutive_dup{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.next();
        String newstr = "";
        newstr+=str.charAt(0);
        char ch=str.charAt(0);
        for (int i=1 ; i<str.length() ; i++){
            if (ch!=str.charAt(i)){
                newstr+=str.charAt(i);
                ch=str.charAt(i);
            }
        }
        System.out.print("new string will be \n"+newstr);
    }
}