import java.util.Scanner;

public class greatest_common_divisor{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = pointer.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = pointer.nextInt();
        for (int count=(num1<num2)?num1:num2 ; count>0 ; count--){
            if ((num1%count==0)&(num2%count==0)){
                System.out.print("Greatest Common Divisor is "+count);
                break;
            }

        }
    }
}