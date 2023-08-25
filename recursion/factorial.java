import java.util.*;

public class factorial{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        int fct = fact(num);
        System.out.print("The factorial of "+num+" is: "+fct);
    }

    public static int fact(int num){
        if (num==0){
            return 1;
        }
        return num*fact(num-1);
    }
}