import java.util.*;

public class palindromic_substrings{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int len = scn.nextInt();
        System.out.println("Enter the elements: ");
        for (int i=0 ; i<len ; i++){
            list.add(scn.next());
        }
        int flag=1;
        String str = "";
        int mini=0,maxi=list.size()-1;
        System.out.println("Palindromic strings are: ");
        for(int i=0 ; i<list.size() ; i++){
            for (int j=list.size()-1 ; j>=i ; j--){
                for (int ci=i ; ci<=j ; ci++){
                    str+=list.get(ci);
                }

                for (int k=0 ; k<str.length()/2 ;k++){
                    if (str.charAt(k)!=str.charAt(str.length()-k-1)){
                        flag=0;
                        break;
                    }
                }

                if (flag==1){
                    for (int ci=i ; ci<=j ; ci++){
                        System.out.print(list.get(ci)+" ");
                    }
                    System.out.println();
                }
                flag=1;  
                str="";  
            }
        }
    }
}