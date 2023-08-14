import java.util.*;

public class matrix_multiplication{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of first array: ");
        int arr_len1 = scn.nextInt();
        int arr_len2 = scn.nextInt();
        int[][] arr1 = new int[arr_len1][arr_len2]; 
        System.out.println("Enter the numbers for first array: ");
        for(int i=0 ; i<arr_len1 ;i++){
            for(int j=0 ; j<arr_len2 ;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        System.out.print("Enter the length of second array: ");
        int arr_len3 = scn.nextInt();
        int arr_len4 = scn.nextInt();
        int[][] arr2 = new int[arr_len3][arr_len4]; 
        System.out.println("Enter the numbers for second array: ");
        for(int i=0 ; i<arr_len3 ;i++){
            for(int j=0 ; j<arr_len4 ;j++){
                arr2[i][j]=scn.nextInt();
            }
        }
        if (arr_len2!=arr_len3){
            System.out.print("Matrices are not compatible for multiplication");
            return ;
        }

        int[][] arr = new int[arr_len1][arr_len4];
        int csum=0;
        for (int i=0 ; i<arr_len1 ; i++){
            for (int j=0 ; j<arr_len4 ; j++){
                for (int k=0 ; k<arr_len2 ; k++){
                    csum+=arr1[i][k]*arr2[k][j];
                }
                arr[i][j]=csum;
                csum=0;
            }
        }
        
        System.out.println("Requested array: ");
        for (int i=0 ; i<arr_len1 ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }


    }
}