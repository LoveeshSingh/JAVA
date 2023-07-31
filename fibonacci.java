import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = pointer.nextInt();
        System.out.println("Fibonacci series is: ");
        for (int i=0,j=1,sum,count=1 ; count<=num ; count++ ){
            sum=i+j;
            i=j;
            System.out.print(j+" ");
            j=sum;
        }
    }
}