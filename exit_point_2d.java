import java.util.*;

public class exit_point_2d{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of 2d array: ");
        int arr_len1 = scn.nextInt();
        int arr_len2 = scn.nextInt();
        int[][] arr = new int[arr_len1][arr_len2]; 
        System.out.println("Enter the numbers(should be 0 or 1): ");
        for(int i=0 ; i<arr_len1 ;i++){
            for(int j=0 ; j<arr_len2 ;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int ci=-1;
        int cj=-1;

        for(int dire=0,i=0,j=0 ; (i>=0)&&(i<arr_len1)&&(j>=0)&&(j<arr_len2) ; ){
            ci=i;
            cj=j;
            dire+=arr[i][j];
            switch (dire%4){
                case 0:
                    j++;
                    break;
                case 1:
                    i++;
                    break;
                case 2:
                    j--;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
        System.out.print("exit point : "+ci+","+cj);
    }
}