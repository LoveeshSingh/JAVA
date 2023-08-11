import java.util.*;

public class triplet_target_sum{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len]; 
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr_len ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scn.nextInt();
        Arrays.sort(arr);
        System.out.println("triplet of array that make target sum: ");
        for (int i=0 ; i<(arr_len-2) ; i++){
            for (int j=i+1,k=(arr_len-1) ; j<k ;j++,k--){
                if (arr[i]+arr[j]+arr[k]==target){
                    System.out.println("( "+arr[i]+" , "+arr[j]+" , "+arr[k]+" )");
                }
                else if (arr[i]+arr[j]+arr[k]<target){
                    k++;
                }
                else{
                    j--;
                }
            }
        }
    }
}