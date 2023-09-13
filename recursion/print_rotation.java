import java.util.*;

public class print_rotation{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter? ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr.length ; i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("How many times you want to rotate? ");
        int k = scn.nextInt();
        rotate(arr,k,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr,int k,int len){
        if (k==0){
            return;
        }
        int last=arr[0];
        for(int i=0 ; i<len-1 ; i++){
            arr[i]=arr[i+1];
        }
        arr[len-1]=last;
        rotate(arr,k-1,len);
    }
}