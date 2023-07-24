import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter number: ");
        String num = pointer.next();
        int len = num.length();
        int flag = 0;
        for (int i=0 ; i<len/2 ; i++ ){
            if (num.charAt(i)!=num.charAt(len-i-1)){
                flag=1;
                break;
            }
        }

        if (flag==1){
            System.out.print("Number is not a palindrome");
        }
        else{
            System.out.print("Number is a palindrome");
        }
    }
}