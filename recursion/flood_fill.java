import java.util.*;

public class flood_fill{
    public static void main(String[] args){
        int[][] arr={{1,1,1,1},
                     {1,1,1,1},
                     {1,1,1,1},
                     {1,1,1,1}
                    };
        ArrayList<String> list = flooded(arr,0,0,3,3);
        System.out.print(list);
    }

    public static ArrayList<String> flooded(int[][] arr ,int sr,int sc,int dr,int dc){
        if( sr<0 || sc<0 || sr>=arr.length || sc>=arr[0].length || arr[sr][sc]==0)
            return new ArrayList<String>();

        if ((sr==dr)&&(sc==dc)){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        arr[sr][sc]=0;
        ArrayList<String> list = new ArrayList<>(); 
        ArrayList<String> list1 = new ArrayList<>(); 
        ArrayList<String> list2 = new ArrayList<>(); 
        ArrayList<String> list3 = new ArrayList<>(); 
        ArrayList<String> list4 = new ArrayList<>(); 

        list1 = flooded(arr,sr+1,sc,dr,dc);
        list2 = flooded(arr,sr-1,sc,dr,dc);
        list3 = flooded(arr,sr,sc+1,dr,dc);
        list4 = flooded(arr,sr,sc-1,dr,dc);

        for (int i=0 ; i<list1.size() ; i++){
            list1.set(i,"D" + list1.get(i));
        }
        
        for (int i=0 ; i<list2.size() ; i++){
            list2.set(i,"U" + list2.get(i));
        }
        
        for (int i=0 ; i<list3.size() ; i++){
            list3.set(i,"R" + list3.get(i));
        } 
        
        for (int i=0 ; i<list4.size() ; i++){
            list4.set(i,"L" + list4.get(i));
        }

        list.addAll(list1);
        list.addAll(list2);
        list.addAll(list3);
        list.addAll(list4);
            
        arr[sr][sc]=1;
        return list;
    }
}