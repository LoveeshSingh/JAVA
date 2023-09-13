import java.util.*;

public class sum_duplicate{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many number you want to enter? ");
        int arr_len = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr_len ; i++){
            list.add(scn.nextInt());
        }
        adder(list,0,list.get(0),0);
        System.out.println(list);
    }

    public static void adder(ArrayList<Integer> list,int sum,int num,int index){
        if (index==list.size()){
            list.add(sum);
            return;
        }
        else{
            if (list.get(index)==num){
                list.remove(index);
                adder(list,sum+num,num,index);
            }
            else {
                num=list.get(index);
                list.set(index,sum);
                adder(list,num,num,index+1);
            }
        }
    }
}