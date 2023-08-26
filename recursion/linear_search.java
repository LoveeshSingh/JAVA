import java.util.*;

public class linear_search{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arr_len = scn.nextInt();
        int[] arr = new int[arr_len];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<arr_len ; i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter the number to find: ");
        int find = scn.nextInt();

        //first occurence

        System.out.println("First occurence of the Element is found at: ");
        int first=linear_first_occ(arr,find,0);
        if (first!=-1){
            System.out.println(first);
        }
        else{
            System.out.println("first occurence not found");
        }

        //last occurence

        System.out.println("Last occurence of the Element is found at: ");
        int last=linear_last_occ(arr,find,arr_len-1);
        if (last!=-1){
            System.out.println(last);
        }
        else{
            System.out.println(" last occurence not found");
        }

        //all occurences

        System.out.println("All occurences of Element are found at: ");
        linear_all_occ(arr,find,0);
    }

    public static int  linear_first_occ(int[] arr,int find,int index){
        if (index==arr.length-1){
            if (arr[index]==find){
                return index;
            }
            return -1;
        }
        else{
            if(arr[index]==find){
                return index;
            }
            else{
                return linear_first_occ(arr,find,index+1);
            }
        }
    }

    public static int  linear_last_occ(int[] arr,int find,int index){
        if (index==0){
            if (arr[index]==find){
                return index;
            }
            return -1;
        }
        else{
            if(arr[index]==find){
                return index;
            }
            else{
                return linear_last_occ(arr,find,index-1);
            }
        }
    }

    public static void linear_all_occ(int[] arr,int find,int index){
        if (index==arr.length-1){
            if (arr[index]==find){
                System.out.println(index);
                return ;
            }
            return ;
        }
        else{
            if(arr[index]==find){
                System.out.println(index);
                linear_all_occ(arr,find,index+1);
                return;
            }
            else{
                linear_all_occ(arr,find,index+1);
                return;
            }
        }
    }
}