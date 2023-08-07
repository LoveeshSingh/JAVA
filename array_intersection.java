import java.util.*;

public class array_intersection{
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
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.print("Intersection of the array are: ");
        for (int i=0,j=0 ; (i<n)&&(j<m) ; i++,j++){
            if (arr1[i]<arr2[j]){
                j--;
            }
            else if (arr1[i]>arr2[j]){
                i--;
            }
            else{
                System.out.print(arr1[i]+"  ");
            }
        }
    }
}