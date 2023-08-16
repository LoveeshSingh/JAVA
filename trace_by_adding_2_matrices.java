import java.util.*;

public class trace_by_adding_2_matrices{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of 2d array: ");
        int arr_len1 = scn.nextInt();
        int arr_len2 = scn.nextInt();
        int[][] arr1 = new int[arr_len1][arr_len2]; 
        System.out.println("Enter the numbers for array 1: ");
        for(int i=0 ; i<arr_len1 ;i++){
            for(int j=0 ; j<arr_len2 ;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        int[][] arr2 = new int[arr_len1][arr_len2]; 
        System.out.println("Enter the numbers for array 2: ");
        for(int i=0 ; i<arr_len1 ;i++){
            for(int j=0 ; j<arr_len2 ;j++){
                arr2[i][j]=scn.nextInt();
            }
        }

        //will add 2 matrices in arr1

        for (int i=0 ; i<arr_len1 ; i++){
            for (int j=0 ; j<arr_len2 ; j++){
                arr1[i][j]+=arr2[i][j];
            }
        }
        int sum = 0;
        for (int i=0 ; i<arr_len1 ; i++){
            sum+=arr1[i][i];
        }
        System.out.print("trace of sum of 2 matrices is: "+sum);
    }
}