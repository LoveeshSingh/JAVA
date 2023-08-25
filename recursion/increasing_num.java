import java.util.*;

public class increasing_num{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        inc(num);
    }

    public static void inc(int num){
        if (num==0){
            return;
        }
        inc(num-1);
        System.out.println(num);
    }
}