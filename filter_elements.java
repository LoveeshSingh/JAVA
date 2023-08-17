import java.util.*;

public class filter_elements{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int num = scn.nextInt();
        for (int i=0 ; i<num ; i++){
            int once = scn.nextInt();
            list.add(once);
        }
        System.out.print("enter a number : ");
        int key = scn.nextInt();

        //filtering out elements that are greater than keys
    
        for (int i=0 ; i<list.size() ; ){
            if (list.get(i)>key){
                list.remove(i);
            }
            else{
                i++;
            }
        }
        System.out.println("The Array list after deletion: ");
        for (int val:list){
            System.out.println(val);
        }
    }
}