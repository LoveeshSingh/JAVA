import java.util.Scanner;

public class ascii_value{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char asc = pointer.next().charAt(0);
        int as = asc;
        System.out.print("ASCII value is: " + as);
    }
}