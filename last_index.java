import java.util.Scanner;

public class last_index{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter? ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr.length ; i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter the number to find last index: ");
        int num = scn.nextInt();
        int store = -1;
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i]==num){
                store=i;
            }
        }

        if (store==-1){
            System.out.print("Number not found");
        }
        else {
            System.out.print("Last index of the number is: "+store);
        }

    }
}