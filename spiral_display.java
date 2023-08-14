import java.util.*;

public class spiral_display{
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

        int mini=0 , maxi=arr_len1-1;
        int minj=1 , maxj=arr_len2-1;
        int dir=0 , i=0 , j=0;
        System.out.println("printing values in spiral display:  ");

        for (int k=0 ; k<(arr_len1*arr_len2) ; k++){
            System.out.println(arr[i][j]);
            if (dir==0){
                if (i==maxi){
                    dir=1;
                    j++;
                    maxi-=1;
                }
                else{
                    i++;
                }
            }
            else if (dir==1){
                if (j==maxj){
                    dir=2;
                    i--;
                    maxj-=1;
                }
                else{
                    j++;
                }
            }
            else if (dir==2){
                if (i==mini){
                    dir=3;
                    j--;
                    mini+=1;
                }
                else{
                    i--;
                }
            }
            else if (dir==3){
                if (j==minj){
                    dir=0;
                    i++;
                    minj+=1;
                }
                else{
                    j--;
                }
            }
        }
    }
}