import java.util.*;

public class n_queens{
    public static void main(String[] args){
        //chess should be false boolean here 8x8 chess is used
        boolean[][] chess =  {
            {false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false}
        };
        isQueenSafe(chess,9,0,"");
    }

    public static void isQueenSafe(boolean[][] chess , int queens ,int column,String str){
        if (queens==0){
            System.out.println(str);
            return;
        }
        else if (column>=chess[0].length){
            return;
        }
        for (int i=0 ; i<chess.length ; i++ ){
            int flag=0;
            // checking west side
            for (int j=0 ; j<column ; j++){
                if (chess[i][j]){
                    flag=1;
                    break;
                }
            }

            //checking north west side
            for (int r=i,c=column ; ((r>=0)&&(c>=0)) ; r--,c--){
                if (chess[r][c]){
                    flag=1;
                    break;
                }
            }

            //checking south west side
            for (int r=i,c=column ; ((r<chess.length)&&(c>=0)) ; r++,c--){
                if (chess[r][c]){
                    flag=1;
                    break;
                }
            }

            if (flag==0){
                chess[i][column]=true;
                isQueenSafe(chess , queens-1 , column+1 ,str+Integer.toString(i)+Integer.toString(column)+" || " );
                chess[i][column]=false;
            }
        }
    }
}