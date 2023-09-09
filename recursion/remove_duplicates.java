import java.util.*;

public class remove_duplicates{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter? ");
        int arr_len = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr_len ; i++){
            list.add(scn.nextInt());
        }
        remover(list,9999999,0);
        System.out.println(list);
    }

    public static void remover(ArrayList<Integer> list , int element , int index){
        if (index==list.size()){
            return;
        }
        else{
            if (list.get(index)==element){
                list.remove(index);
                remover(list,element,index);
            }
            else{
                remover(list,list.get(index),index+1);
            }
        }
    }
}