import java.util.Scanner;

public class recursion_factorial{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = pointer.nextInt();
        int f = fact(num);
        System.out.print("factorial of " + num + " is " + f);
    }

    public static int fact(int num){
        if (num==0){
            return 1;
        }
        return num * fact(num-1);
    }

}