import java.util.*;

public class max_sum_subarray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len]; 
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr_len ; i++){
            arr[i] = scn.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        for (int i=0 ; i<arr_len ; i++){
            int sum = 0;
            for (int j=i ; j<arr_len ; j++){
                sum+=arr[j];
                if (sum>maxsum){
                    maxsum=sum;
                }
            }
        }
        System.out.print("max value of sub array can be:  "+maxsum);
    }
}