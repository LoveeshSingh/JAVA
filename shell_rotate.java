import java.util.*;

public class shell_rotate{
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

        int mini=0,maxi=arr_len1-1;
        int minj=0,maxj=arr_len2-1;
        int dir=0,i=0,j=0;
        int change=0;

        for (int k=1 ; k<(arr_len1*arr_len2) ; k++){
            if (dir==0){
                if (i==mini){
                    change=arr[i][j];
                }
                else if (i==maxi)&&(j!=maxj{
                    arr[i][j];
                } 
                else if ((i==maxi)&&(j==maxj)){
                    
                }  
                i++;             
            }
            else if (dir==1){
                
            }
            else if (dir==2){
                
            }
            else if (dir==3){
                
            }
        }
    }
}