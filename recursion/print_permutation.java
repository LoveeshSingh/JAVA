//5 boxes 2 objects
import java.util.*;

public class print_permutation{
    public static void main(String[] args){
        boolean[] box ={true,true,true,true,true};
        permute(box,2,2,"");
    }

    public static void permute(boolean[] box , int object,int left,String str){
        if ((left==0)||(object>box.length)){
            System.out.println(str);
            return;
        }
        for (int i=0 ; i<box.length ; i++){
            if (box[i]){
                box[i]=false;
                permute(box,object,left-1,str+((object-left+1)+" object at "+(i+1)+" || "));
                box[i]=true;
            }
        }
        System.out.println();
    }
}