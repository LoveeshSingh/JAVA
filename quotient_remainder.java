import java.util.Scanner;

public class quotient_remainder{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter the value of divident: ");
        int divident = pointer.nextInt();
        System.out.print("Enter the value of divisor: ");
        int divisor = pointer.nextInt();
        int remainder = divident % divisor;
        int quotient = (divident-remainder)/divisor;
        System.out.println("Remainder is: "+remainder+"\nQuotient is: "+quotient);
    }
}