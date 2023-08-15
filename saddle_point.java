import java.util.*;

public class saddle_point{
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
        //min in row, max in column

        System.out.println("Saddle point : ");
        for (int i=0 ; i<arr_len1 ; i++){
            for (int j=0 ; j<arr_len2 ; j++){
                int check=0;
                //row check
                for (int k=0 ; k<arr_len2 ; k++){
                    if (k!=j){
                        if (arr[i][j]<=arr[i][k]){
                            check=1;
                            break;
                        }
                    }
                }
                for (int k=0 ; k<arr_len1 ; k++){
                    if (k!=i){
                        if (arr[i][j]>=arr[k][j]) {
                            check=1;
                            break;
                        }
                    }
                }
                if (check==0){
                    System.out.println(i+","+j);
                    return;
                }

            }
        }
    }
}