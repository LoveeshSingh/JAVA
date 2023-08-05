import java.util.*;

public class array_inverse{
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

        // without extra space

        for (int index1=-1 , value1=arr[0] , value2; index1!=0 ;){
            value2=arr[value1];
            arr[value1]=(index1==-1)?0:index1;
            index1=value1;
            value1=value2;
        }
        System.out.print("inverted array: "+Arrays.toString(arr));
    }
}