import java.util.*;

public class decreasing_increasing{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        decinc(num);
    }

    public static void decinc(int num){
        if (num==0){
            return;
        }
        System.out.println(num);
        decinc(num-1);
        System.out.println(num);
    }
}