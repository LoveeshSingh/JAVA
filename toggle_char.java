import java.util.*;

public class toggle_char{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.next();
        String newstr = new String();
        int check=0;
        for (int i=0 ; i<str.length() ; i++){
            if ((str.charAt(i)>=65)&&(str.charAt(i)<=90)){
                newstr+=(char)(32+((int)(str.charAt(i))));
            }
            else if ((str.charAt(i)>=97)&&(str.charAt(i)<=122)){
                newstr+=(char)(((int)(str.charAt(i)))-32);
            }
            else{
                newstr+=str.charAt(i);
            }
        } 
        System.out.print(newstr);       
    }
}