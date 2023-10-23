import java.util.*;

public class coin_change_combination{
    public static void main(String[] args){
        // sorted array of coins should be provided in increasing order
        int[] coins= {2,3,5,6};
        coin_combine(coins,7,0,"");
    }

    public static void coin_combine(int[] coins,int sum,int index,String str){
        if (sum==0){
            System.out.println(str);
            return;
        }
        else if ((coins[0]>sum)||(index>=coins.length)){
            return;
        }
        for(int i=index ; i<coins.length ; i++){
            if (coins[i]<=sum){
                coin_combine(coins,sum-coins[i],i,str+(Integer.toString(coins[i]))+" || ");
            }
            else{
                return;
            }
        }
    }
}