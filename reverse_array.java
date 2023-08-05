import java.util.*;

public class reverse_array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter? ");
        int num = scn.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<num ; i++){
            arr[i]=scn.nextInt();
        }

        for (int start=0,end=num-1,copy ; start<end ; start++,end--){
            copy=arr[start];
            arr[start]=arr[end];
            arr[end]=copy;
        }
        System.out.print("Reversed array: "+Arrays.toString(arr));
    }
}