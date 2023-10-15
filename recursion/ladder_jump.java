import java.util.*;

public class ladder_jump{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the stair you are standing at:  ");
        int len = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        jump(len,list);
    }
    public static void jump(int len,ArrayList<Integer> list)
    {
        if (len==0){
            System.out.println(list);
        }
        else{
            for (int i=1 ; i<=len ; i++){
                list.add(i);
                jump(len-i,list);
                list.remove(list.size()-1);
            }
        }
    }
}