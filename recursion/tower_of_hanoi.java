import java.util.*;

public class tower_of_hanoi{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rings: ");
        int ring = scn.nextInt();
        tower(ring,"dt","ht","st");
    }

    public static void tower(int ring , String main_tow , String help_tow , String based_tow){
        if (ring==1){
            System.out.println(ring+" || "+based_tow+" --> "+main_tow);
            return ;
        }
        tower(ring-1,help_tow,main_tow,based_tow);
        System.out.println(ring+" || "+based_tow+" --> "+main_tow);
        tower(ring-1,main_tow,based_tow,help_tow);
    }
}