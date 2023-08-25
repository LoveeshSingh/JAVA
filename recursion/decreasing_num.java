import java.util.*;

public class decreasing_num{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        dec(num);
    }

    public static void dec(int num){
        if (num==0){
            return;
        }
        System.out.println(num);
        dec(--num);
    }
}