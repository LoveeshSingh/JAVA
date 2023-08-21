import java.util.*;

public class string_compression{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.next();
        String newstr="";
        newstr+=str.charAt(0);
        char ch=str.charAt(0);
        int sum=1;
        for (int i=1 ; i<str.length() ; i++){
            if (str.charAt(i)==ch){
                sum++;
            }
            else if(str.charAt(i)!=ch){
                newstr+=sum;
                sum=1;
                ch=str.charAt(i);
                newstr+=str.charAt(i);
            }
        }
        newstr+=sum;
        System.out.print("compressed string is: "+newstr);
    }
}