import java.util.*;

public class wave_display{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of 2d array: ");
        int arr_len1 = scn.nextInt();
        int arr_len2 = scn.nextInt();
        int[][] arr = new int[arr_len1][arr_len2]; 
        System.out.println("Enter the numbers: ");
        for(int i=0 ; i<arr_len1 ;i++){
            for(int j=0 ; j<arr_len2 ;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("values will be displayed in wave manner: ");
        for (int j=0 ; j<arr_len2 ; j++){
            if (j%2==0){
                for (int i=0 ; i<arr_len1 ; i++){
                    System.out.println(arr[i][j]);
                }
            }
            else{
                for(int i=arr_len1-1 ; i>=0 ; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}