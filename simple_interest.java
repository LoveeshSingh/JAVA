import java.util.Scanner;

public class simple_interest{
    public static void main(String[] args){
        int p,r=4;
        Scanner pointer= new Scanner(System.in);
        System.out.print("enter the principal  ");
        p=pointer.nextInt();
        System.out.println("simple interest 2 years is "+(p*r*2/100));
    }
}