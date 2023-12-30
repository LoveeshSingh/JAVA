import java.util.*;

public class sudoku{
    public static void main(String[] args){
        int[][] board= new int[][]{
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        isSudokuPossible(board,0,0);
    }

    public static void isSudokuPossible(int[][] board , int i , int j){
        
        if (i>=board.length){
            printBoard(board);
        }
        else if(j>=board.length){
            isSudokuPossible(board,i+1,0);
        }
        else{
            if (board[i][j]==0){
                for (int check=1 ; check<=9 ; check++){
                    int flag=0;
                    for (int row=i , column=0 ; column<=8 ;column++){
                        if (board[row][column]==check){
                            flag=1;
                        }
                    }
                    for (int row=0 , column=j ; row<=8 ;row++){
                        if (board[row][column]==check){
                            flag=1;
                        }
                    }
                    for (int row=i-i%3 ; row<i-i%3+3 ; row++){
                        for (int column=j-j%3 ; column<j-j%3+3 ; column++){
                            if (board[row][column]==check){
                                flag=1;
                            }
                        }
                    }

                    if (flag==0){
                        board[i][j]=check;

                        isSudokuPossible(board,i,j+1);
                        board[i][j]=0;
                    }

                }
            }
            else{
                isSudokuPossible(board,i,j+1);
            }
        }  
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

