import java.util.*;

public class mirror_inverse{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arr_size = scn.nextInt();
        System.out.println("Enter the values of the array (Values should be less than the size of array and should not repeat): ");
        int[] arr= new int[arr_size];
        for (int i=0 ; i<arr_size ; i++ ){
            arr[i]=scn.nextInt();
            if (arr[i]>=arr_size){
                System.out.println("Above value was not valid enter again");
                i--;
            }
        }

        boolean flag=true;
        for (int i=0 ; i<arr_size ;i++){
            if (arr[arr[i]]!=i){
                flag=false;
                break;
            }
        }
        if (flag==true){
            System.out.print("array is a mirror inverse");
        }
        else {
            System.out.print("array is not a mirror inverse");
        }
    }
}