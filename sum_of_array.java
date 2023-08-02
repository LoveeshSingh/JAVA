import java.util.*;

public class sum_of_array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter in arr1? ");
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr1.length ; i++){
            arr1[i]=scn.nextInt();
        }
        System.out.print("How many number you want to enter in arr2? ");
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr2.length ; i++){
            arr2[i]=scn.nextInt();
        }
        //above code was to get the 2 arrays
        //now making arr1 integer in num1
        int num1 = 0;
        for (int i=0 ; i<n ; i++){
            num1+=arr1[n-i-1]*Math.pow(10,i);
        }
        //now making arr2 integer in num2
        int num2 = 0;
        for (int i=0 ; i<m ; i++){
            num2+=arr2[m-i-1]*Math.pow(10,i);
        }
        //adding the numbers
        int sum=num1+num2;
        int lens = (int)(Math.log10(sum)+1);
        //making sum into array arr3
        int[] arr3 = new int[lens];
        for (int i=lens-1,num; i>=0 ; i--){
            num=sum%10;
            sum/=10;
            arr3[i]=num;
        }
        System.out.print("Array after addition: " + Arrays.toString(arr3));
    }
}