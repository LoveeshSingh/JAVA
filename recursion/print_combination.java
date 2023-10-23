import java.util.*;

public class print_combination{
    public static void main(String[] args){
        combine(5,3,1,"");
    }
    public static void combine(int box,int object,int index,String str){
        if ((object==0)||(object>box)){
            System.out.println(str);
            return;
        }
        for(int i=index ; i<=box-object+1 ; i++){
            combine(box,object-1,i+1,str+" object at "+(Integer.toString(i))+" ||");
        }
    }
}