import java.util.*;

public class display_reverse_array{
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
        display_array(arr,arr_len-1);
    }

    public static void display_array(int[] arr,int index){
        if (index==0){
            System.out.println(arr[index]);
            return;
        }
        System.out.println(arr[index]);
        display_array(arr,index-1);
    }
}