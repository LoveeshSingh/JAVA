import java.util.*;

public class string_permutations{
    public static void permute(String str,int index){
        if (index==str.length()){
            return;
        }
        for (int i=index ; i<str.length() ; i++){
            str = swap(str,index,i);
            if(index!=i){
                System.out.println(str);
            }
            permute(str,index+1);
            str = swap(str,index,i);
        }
    }
     
    public static String swap(String str,int i,int j){
        StringBuilder strB = new StringBuilder(str);
        char l = strB.charAt(i) , r = strB.charAt(j);
        strB.setCharAt(i,r);
        strB.setCharAt(j,l);
         return strB.toString();
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.next();
        permute(str,0);
    } 
}