import java.util.*;

public class dynamic_stairs{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter? ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr.length ; i++){
            arr[i]=scn.nextInt();
        }
        ArrayList<String> list = dynamics(arr,0);
        System.out.print(list);
    }

    public static ArrayList<String> dynamics(int[] arr,int index){
        if ((index==arr.length-1)||(arr[index]==0)){
            ArrayList<String> list = new ArrayList<>();
            list.add(Integer.toString(index));
            return list;
        }
        else {
            ArrayList<String> list1 = new ArrayList<>();
            for (int i=1 ; ((i<=arr[index])&&(i<=arr.length-index-1)) ; i++){
                ArrayList<String> list = dynamics(arr,index+i);
                for (int j=0 ; j<list.size() ; j++){
                    list.set(j,Integer.toString(index)+list.get(j));
                }
                list1.addAll(list);
            }
            return list1;
        }
    }
}