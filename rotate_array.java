import java.util.*;

public class rotate_array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len]; 
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr_len ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter the number of times you wnt to rotate array: ");
        int rotate = scn.nextInt();
        for (int i=0 ; i<rotate ; i++){
            int num = arr[0];
            for (int j=0 ; j<(arr_len-1) ; j++){
                arr[j]=arr[j+1];
            }
            arr[arr_len-1]=num;
        }
        System.out.print("Reversed array: "+Arrays.toString(arr));
    }
}