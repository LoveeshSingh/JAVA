import java.util.*;

public class n_knights{
    public static void main(String[] args){
        //chess should be false boolean here 8x8 chess is used
        boolean[][] chess =  {
            {false,false,false},
            {false,false,false},
            {false,false,false}
        };
        isKnightSafe(chess,5,0,0,"");
    }

    public static void isKnightSafe(boolean[][] chess , int knights ,int row,int column,String str){
        if (knights<=0){
            System.out.println(str);
            return;
        }
        else if (row>=chess.length){
            return;
        }
        else if (column<chess[0].length){
            for (int i=row,j=(str=="")?0 : column+1 ; j<chess[0].length ; j++){
                int flag=0;
                // checking western_north side
                if (((i-1)>=0)&&((j-2)>=0)&&(chess[i-1][j-2])){
                    flag=1;
                }
                //checking northern_west side
                if (((i-2)>=0)&&((j-1)>=0)&&(chess[i-2][j-1])){
                    flag=1;
                }
                //checking northern_east side
                if (((i-2)>=0)&&((j+1)<chess[0].length)&&(chess[i-2][j+1])){
                    flag=1;
                }
                //checking eastern_north side
                if (((i-1)>=0)&&((j+2)<chess[0].length)&&(chess[i-1][j+2])){
                    flag=1;
                }

                if (flag==0){
                    chess[i][j]=true;
                    isKnightSafe(chess , knights-1 , i , j , str+Integer.toString(i)+Integer.toString(j)+" || " );
                    chess[i][j]=false;
                }
            }
        }
        for (int i=row+1 ; i<chess.length ; i++){
            for (int j=0 ; j<chess[0].length ; j++ ){
                int flag=0;
                // checking western_north side
                if (((i-1)>=0)&&((j-2)>=0)&&(chess[i-1][j-2])){
                    flag=1;
                }
                //checking northern_west side
                if (((i-2)>=0)&&((j-1)>=0)&&(chess[i-2][j-1])){
                    flag=1;
                }
                //checking northern_east side
                if (((i-2)>=0)&&((j+1)<chess[0].length)&&(chess[i-2][j+1])){
                    flag=1;
                }
                //checking eastern_north side
                if (((i-1)>=0)&&((j+2)<chess[0].length)&&(chess[i-1][j+2])){
                    flag=1;
                }

                if (flag==0){
                    chess[i][j]=true;
                    isKnightSafe(chess , knights-1 , i , j , str+Integer.toString(i)+Integer.toString(j)+" || " );
                    chess[i][j]=false;
                }
            }
        }
    }
}