import java.util.*;

public class kadanes_algorithm{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len]; 
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr_len ; i++){
            arr[i] = scn.nextInt();
        }
        int ci=0,cj=0,csum=arr[0];
        int bi=0,bj=0,bsum=arr[0];
        for (int i=1 ; i<arr_len ; i++){
            if (csum>0){
                csum+=arr[i];
                cj+=1;
            }
            else{
                csum=arr[i];
                ci=i;
                cj=i;
            }
            if(csum>bsum){
                bi=ci;
                bj=cj;
                bsum=csum;
            }
        }
        System.out.println("max sum subarray has index : ["+bi+","+bj+"] ");
        System.out.print("max value of subarray is: "+bsum);
    }
}