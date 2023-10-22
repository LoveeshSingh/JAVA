import java.util.*;

public class lexico_graphical_order{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        lgo(231,1,list);
        System.out.print(list);
    }

    public static void lgo(int num , int check,ArrayList<Integer> list ){
        if (check>num){
            return ;
        }
        list.add(check);
        lgo(num,check*10,list);
        for(int i=1 ; i<=9 ; i++){
            if ((check+i<=num)&&((check+i)!=10)){
                list.add(check+i);
                lgo(num,(check+i)*10,list);
            }
            else{
                break;
            }
        }
    }
}