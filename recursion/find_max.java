import java.util.*;

public class find_max{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr_len ; i++){
            arr[i]=scn.nextInt();
        }
        
        System.out.println("Maximum element in the Array is: ");
        int find=max(arr,arr_len-1);
        System.out.print(find);
    }

    public static int  max(int[] arr,int index){
        if (index==0){
            return arr[index];
        }
        
        int check = max(arr,index-1);
        if (arr[index]>check){
            return arr[index];
        }
        else{
            return check;
        }
    }
}