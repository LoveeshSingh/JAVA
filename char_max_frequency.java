import java.util.*;

public class char_max_frequency{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.next();
        int[] arr = new int[26];
        for (int i=0 ; i<str.length() ; i++){
            if ((str.charAt(i)>=65)&&(str.charAt(i)<=90)){
                arr[(int)(str.charAt(i))-65]+=1;
            }
            else if ((str.charAt(i)>=97)&&(str.charAt(i)<=122)){
                arr[(int)(str.charAt(i))-97]+=1;
            }
        }
        int max=0;
        for (int i=0 ; i<26 ; i++){
            if (arr[i]>max){
                max=i;
            }
        }
        System.out.print("Character having most frequency: "+(char)(max+65));
    }
}