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

        //binary search starts from here(use only one of the three things written below)

        int index=-1;
        for (int start=0,end=arr_size-1 ,mid=end/2 ; (start<=end) ; ){
            if (arr[mid]==fin){
                index=mid;
                //to find the number
                break;
                //to find the numbers first occurence
                // end=mid-1;
                //to find the numbers last occurence
                // start=mid+1;
            }
            else if (arr[mid]>fin){
                end=mid-1;
            }
            else if (arr[mid]<fin){
                start=mid+1;
            }
            mid=(start+end)/2;
        }

        if (index==-1){
            System.out.print("number not found");
        }
        else{
            System.out.print("number found at index "+index);
        }


    }
}