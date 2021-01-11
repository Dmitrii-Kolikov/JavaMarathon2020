package day17;

import static day17.ChessPiece.*;

public class Task1 {
    public static void main(String[] args)  {
        String[] figures = new String[8];
        for(int i = 0; i < figures.length; i++) {
            figures[i] = PAWN_WHITE.getPiece();
            if(i > 3) {
                figures[i] = ROOK_BLACK.getPiece();
            }
            System.out.print(figures[i] + " ");
        }
    }

}