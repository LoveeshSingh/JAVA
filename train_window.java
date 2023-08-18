import java.util.*;
public class train_window{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int len = scn.nextInt();
        System.out.println("Enter the elements: ");
        for (int i=0 ; i<len ; i++){
            list.add(scn.nextInt());
        }

        System.out.println("Enter the first and last index seen from the window: ");
        int si = scn.nextInt();
        int ei = scn.nextInt();
        System.out.println("Number seen from train window ");
        for (int i=0 ; i<list.size() ; i++){
            for (int j=si ; j<=ei ; j++){
                System.out.print(list.get(j%list.size())+"  ");
            }
            System.out.println();
            si++;
            ei++;
        }

    }
}