import java.util.*;

public class power{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter its power: ");
        int num2 = scn.nextInt();
        int pwr = pow(num1,num2);
        System.out.print(num1+" to the power "+num2+" is: "+pwr);
    }

    public static int pow(int num1,int num2){
        if (num2==0){
            return 1;
        }
        return num1*pow(num1,num2-1);
    }
}