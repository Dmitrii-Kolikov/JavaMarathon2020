package day17;

import java.util.Arrays;

public class ChessBoard {
    private String[][] chessBoard;

    ChessBoard(String[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (chessBoard[i][j] == null) {
                    chessBoard[i][j] = ChessPiece.EMPTY.getPiece();
                }
                }
            }
          this.chessBoard = chessBoard;
        }
        public void print() {
            for (int i = 0; i < chessBoard.length; i++) {
                for (int j = 0; j < chessBoard[i].length; j++) {
                    System.out.print(chessBoard[i][j]);
                }
                System.out.println();
            }
        }
    }


