import java.util.*;

public class dup_element{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arr_size = scn.nextInt();
        System.out.println("Enter the values of the array (Values should be less than the size of array): ");
        int[] arr= new int[arr_size];
        for (int i=0 ; i<arr_size ; i++ ){
            arr[i]=scn.nextInt();
            if (arr[i]>=arr_size){
                System.out.println("Above value was not valid enter again");
                i--;
            }
        }

        //two codes are written below use any one of them

        //code using extra space


        int[] arr1= new int[arr_size];
        for (int i=0 ; i<arr_size ; i++){
            arr1[arr[i]]+=1;
        }
        System.out.print("Duplicate numbers in the array are: ");
        for(int i=0 ; i<arr_size ; i++){
            if (arr1[i]>1){
                System.out.print(i+" ");
            }
        }

        code without using extra space

        for (int i=0 ; i<arr_size ; i++){
            arr[(arr[i]%arr_size)]+=arr_size;
        }
        System.out.print("Duplicate numbers in the array are: ");
        for(int i=0 ; i<arr_size ; i++){
            if (arr[i]/arr_size>1){
                System.out.print(i+" ");
           }
        }
    }
}