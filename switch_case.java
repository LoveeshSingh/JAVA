import java.util.Scanner;

public class switch_case{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = pointer.nextInt();
        int flag;
        int switch1 = (num>0)?1:0;
        int switch2 = (num==0)?1:0;
        switch(switch1){
            case 1:
                System.out.print("Number is positive");
                break;
            case 0:
                switch(switch2){
                    case 1:
                        System.out.print("Number is zero");
                        break;
                    case 0:
                        System.out.print("Number is negative");
                        break;
                }

        }
    }
}