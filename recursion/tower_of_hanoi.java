import java.util.*;

public class tower_of_hanoi{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rings: ");
        int ring = scn.nextInt();
        tower(ring,"dt","ht","st");
    }

    public static void tower(int ring , String destination_tow , String help_tow , String source_tow){
        if (ring==1){
            System.out.println(ring+" || "+source_tow+" --> "+destination_tow);
            return ;
        }
        tower(ring-1,help_tow,destination_tow,source_tow);
        System.out.println(ring+" || "+source_tow+" --> "+destination_tow);
        tower(ring-1,destination_tow,source_tow,help_tow);
    }
}