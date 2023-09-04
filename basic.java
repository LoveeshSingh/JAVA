import java.util.*;

public class basic{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter? ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr.length ; i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        int check=0;
        int start=0,end=n;
        for (int i=0 ; i<arr_len-n+1 ; i++){
            for(int j=start ; j<end ; j++){
                if (arr[j]<0){
                    System.out.println(arr[j]);
                    check=1;
                    break;
                }
            }
            if (check==0){
                System.out.println("0");
            }
            check=0;
            start++;
            end++;
        }

    }
}