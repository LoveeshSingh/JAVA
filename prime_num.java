import java.util.Scanner;

public class prime_num{
    public static void main(String[] args){
        int flag=0;
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = pointer.nextInt();
        for (int i =2 ; i<=java.lang.Math.sqrt(num) ; i++ ){
            if (num%i==0){
                flag=1;
            }
        }
        if (num==1)
            System.out.println(num + " is not a prime number");
        else if (num==2)
            System.out.println(num + " is a prime number");
        else if (flag==1)
            System.out.println(num + " is not a prime number");
        else
            System.out.println(num + " is a prime number");
    }
}