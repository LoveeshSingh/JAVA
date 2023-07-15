import java.util.Scanner;

public class input_output{
    public static void main(String[] args){
        System.out.print("provide a number  ");
        Scanner a = new Scanner(System.in);
        int num=a.nextInt(); 
        System.out.print("heres your number  "+num);
    }
}