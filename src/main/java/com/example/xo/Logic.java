package com.example.xo;

public class Logic {

    public static void resetBoard(char[][] gameBoard){
        for (int i=0 ; i<3 ; i++) {
            for (int j=0 ; j<3 ; j++) {
                gameBoard[i][j] = '0';
            }
        }
    }

    public static boolean isWon(char ch , char[][] gameBoard){
        for (int i=0 ; i<3 ; i++) {
            if(gameBoard[i][0] == ch && gameBoard[i][1] == ch && gameBoard[i][2] == ch){
                return true;
            }
            if(gameBoard[0][i] == ch && gameBoard[1][i] == ch && gameBoard[2][i] == ch){
                return true;
            }
        }
        if(gameBoard[0][0] == ch && gameBoard[1][1] == ch && gameBoard[2][2] == ch){
            return true;
        }
        if(gameBoard[2][0] == ch && gameBoard[1][1] == ch && gameBoard[0][2] == ch){
            return true;
        }
        return false;
    }
}
