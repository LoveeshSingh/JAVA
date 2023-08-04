import java.util.*;

public class bin_search{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter? ");
        int arr_size = scn.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("Enter the numbers: (enter the number in sorted manner) ");
        for (int i=0 ; i<arr_size ; i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter the number you want to find: ");
        int fin = scn.nextInt();

        //binary search starts from here

        for (int start=0,end=arr_size-1 ,mid=end/2 ; (start<=end) ; ){
            if (arr[mid]==fin){
                System.out.print("number found at index "+mid);
                break;
            }
            else if (arr[mid]>fin){
                end=mid-1;
                mid=(start+end)/2;
            }
            else if (arr[mid]<fin){
                start=mid+1;
                mid=(start+end)/2;
            }
        }


    }
}