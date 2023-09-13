import java.util.*;

public class print_subsequence{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scn.next();
        ArrayList<String> list = ArrayList<>();
        subsequence(list,str,copy)
    }

    public static void swap(ArrayList<String> list , String str, int index){
        int num = arr[i];
        arr[i]=arr[j];
        arr[j]=num;
    }

    public static void subsequence(int[] arr,int index1,int index2){
        if (index1==index2-1){
            System.out.print(arr[index1]);
            return;
        }
        for (int i=index1 ; i<index2-1 ; i++){
            System.out.print(arr[i]+" ");
            swap(arr,index1,i);
            subsequence(arr,index1+1,index2);
            swap(arr,index1,i);
            System.out.println();
        }
    }
}