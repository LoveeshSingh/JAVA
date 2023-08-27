import java.util.*;

public class reverse_array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr_len ; i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Reverse Array will be displayed now: ");
        int[] rev = rev_array(arr,arr_len-1);
        System.out.print(Arrays.toString(rev));
    }

    public static int[] rev_array(int[] arr,int index){
        if (index==0){
            int[] arr1= new int[arr.length];
            arr1[index]=arr[arr.length-1];
            return arr1;
        }

        int[] arr1=rev_array(arr,index-1);
        arr1[index]=arr[arr.length-1-index];
        return arr1;
    }
}