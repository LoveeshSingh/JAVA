import java.util.*;

public class rotate_matrix{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of 2d array: ");
        int arr_len = scn.nextInt();
        int[][] arr = new int[arr_len][arr_len]; 
        System.out.println("Enter the numbers: ");
        for(int i=0 ; i<arr_len ;i++){
            for(int j=0 ; j<arr_len ;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int[][] copy = new int[arr_len][arr_len];
        for(int i=0 ; i<arr_len ; i++){
            for(int j=0 ; j<arr_len ; j++){
                copy[j][arr_len-i-1] = arr[i][j];
            }
        }
        for(int i=0 ; i<arr_len ; i++){
            System.out.println(Arrays.toString(copy[i]));
        }
    }
}