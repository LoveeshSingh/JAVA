import java.util.*;

public class maze_path_diagonal_allowed{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array|| row-");
        int dr = scan.nextInt();
        System.out.print("Enter the size of array|| column-");
        int dc = scan.nextInt();
        ArrayList<String> list = gmp(0,0,dr-1,dc-1);
        System.out.print(list);
    }

    public static ArrayList<String> gmp(int sr,int sc,int dr,int dc){
        if ((sr==dr)&&(sc==dc)){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        else if (sr==dr){
            ArrayList<String> list = new ArrayList<>();
            for (int j=1 ; j<=dc-sc ; j++){
                ArrayList<String> list1 =gmp(sr,sc+j,dr,dc);
                for (int i=0 ; i<list1.size() ; i++){
                    list1.set(i,"V"+Integer.toString(j)+list1.get(i)); 
                }
                list.addAll(list1);
            }
            return list;
        }
        else if (sc==dc){
            ArrayList<String> list = new ArrayList<>();
            for (int j=1 ; j<=dr-sr ; j++){
                ArrayList<String> list1 =gmp(sr+j,sc,dr,dc);
                for (int i=0 ; i<list1.size() ; i++){
                    list1.set(i,"H"+Integer.toString(j)+list1.get(i));
                }
                list.addAll(list1);
            }
            return list;
        }
        else{
            ArrayList<String> list = new ArrayList<>();

            for (int j=1 ; j<=dc-sc ; j++){
                ArrayList<String> list1 =gmp(sr,sc+j,dr,dc);
                for (int i=0 ; i<list1.size() ; i++){
                    list1.set(i,"V"+Integer.toString(j)+list1.get(i)); // ?????????????????????????????????????
                }
                list.addAll(list1);
            }

            for (int j=1 ; j<=dr-sr ; j++){
                ArrayList<String> list1 =gmp(sr+j,sc,dr,dc);
                for (int i=0 ; i<list1.size() ; i++){
                    list1.set(i,"H"+Integer.toString(j)+list1.get(i));
                }
                list.addAll(list1);
            }

            for (int j=1 ; j<=((dr-sr)<(dc-sc)?(dr-sr):(dc-sc)) ; j++){
                ArrayList<String> list1 =gmp(sr+j,sc+j,dr,dc);
                for (int i=0 ; i<list1.size() ; i++){
                    list1.set(i,"D"+Integer.toString(j)+list1.get(i));
                }
                list.addAll(list1);
            }
            return list;
        }  
    }
}