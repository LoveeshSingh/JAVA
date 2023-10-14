import java.util.*;

public class maze_path{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array|| row-");
        int dr = scan.nextInt();
        System.out.print("Enter the size of array|| column-");
        int dc = scan.nextInt();
        ArrayList<String> list = gmp(0,0,dr,dc);
        System.out.print(list);
    }

    public static ArrayList<String> gmp(int sr,int sc,int dr,int dc){
        if ((sr==dr)&&(sc==dc)){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        else if (sr==dr){
            ArrayList<String> list =gmp(sr,sc+1,dr,dc);
            for (int i=0 ; i<list.size() ; i++){
                list.set(i,"V"+list.get(i));
            }
            return list;
        }
        else if (sc==dc){
            ArrayList<String> list =gmp(sr+1,sc,dr,dc);
            for (int i=0 ; i<list.size() ; i++){
                list.set(i,"H"+list.get(i));
            }
            return list;
        }
        else{
            ArrayList<String> list =gmp(sr,sc+1,dr,dc);
            for (int i=0 ; i<list.size() ; i++){
                list.set(i,"V"+list.get(i));
            }

            ArrayList<String> list1 =gmp(sr+1,sc,dr,dc);
            for (int i=0 ; i<list1.size() ; i++){
                list1.set(i,"H"+list1.get(i));
            }
            list.addAll(list1);
            return list;
        }
        
    }
}