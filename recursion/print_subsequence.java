import java.util.*;

public class print_subsequence{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scn.next();
        ArrayList<String> list = subsequence(str);
        System.out.println(list);
    }

    public static ArrayList<String> subsequence(String str){
        if (str==""){
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }
        ArrayList<String> list = subsequence((str.length()>1)?str.substring(1):"");
        int len = list.size();
        for (int i=0 ; i<len ; i++){
            list.add(str.charAt(0)+list.get(i));
        }
        return list;
    }
}