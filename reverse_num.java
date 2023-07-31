import java.util.Scanner;

public class reverse_num{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = pointer.nextInt();
        int n = 0;
        for (int i=(int)(Math.log10(num)) ; num>0 ; i--){
            n+=Math.pow(10,i)*(num%10);
            num/=10;
        }
        System.out.print("Reversed number : " + n);
    }
}