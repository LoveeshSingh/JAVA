import java.util.Scanner;

public class bar_chart{
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
        // above code was to get an array and find its max value

        for (int i=max ; i>0 ; i-- ){
            for (int j=0 ; j<arr.length ; j++){
                if (arr[j]>=i){
                    System.out.print("\t*");
                }
                else{
                    System.out.print("\t ");
                }
            }
            System.out.println();
        }
    }
}