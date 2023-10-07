import java.util.*;

public class print_all_subarray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int len = scn.nextInt();
        System.out.println("Enter the elements: ");
        for (int i=0 ; i<len ; i++){
            list.add(scn.nextInt());
        }
        System.out.println("All the subarrays are: ");
        for (int j=0 ; j<len ; j++){
            label:
                for (int sze = list.size() , i=0 ; i<=sze ; i++){
                    if (sze==0){
                        list.remove(0);
                        break label;
                    }
                    else if (i==sze){
                        sze--;
                        i=-1;
                        System.out.println();
                    }
                    else{
                        System.out.print(list.get(i) +"  ");
                    }
                }
        }
    }
}