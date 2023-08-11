import java.util.*;

public class target_sum{
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
        System.out.println("pair of elements in array that make target sum: ");
        for(int i=0,j=arr_len-1 ; i<=j ; i++,j--){
            if ((arr[i]+arr[j])==target){
                System.out.println("( "+arr[i]+" , "+arr[j]+" )");
            }
            else if ((arr[i]+arr[j])>target){
                i--; 
            }
            else{
                j++;
            }
        }
    }
}