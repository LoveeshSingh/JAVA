import java.util.*;

public class coin_change_permutation{
    public static void main(String[] args){
        // sorted array of coins should be provided in increasing order
        int[] coins= {2,3,5,6};
        coin_permute(coins,20,"");
    }

    public static void coin_permute(int[] coins, int sum, String str){
        if (sum==0){
            System.out.println(str);
            return;
        }
        else if (coins[0]>sum){
            return;
        }
        else{
            for(int i=0 ; i<coins.length ; i++){
                if (coins[i]<=sum){
                    coin_permute(coins,sum-coins[i],str+Integer.toString(coins[i])+" || ");
                }
                else{
                    return;
                }
            }
    
        }

    }
}