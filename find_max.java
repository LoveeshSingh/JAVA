import java.util.Scanner;

public class find_max{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter? ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max=0;
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr.length ; i++){
            arr[i]=scn.nextInt();
        }
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("Highest number in array: "+max);
    }
}