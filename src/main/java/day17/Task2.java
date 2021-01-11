package day17;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == 0) {
                    array[i][0] = ChessPiece.ROOK_BLACK.getPiece();
                    array[i][5] = ChessPiece.ROOK_BLACK.getPiece();
                    array[i][6] = ChessPiece.KING_BLACK.getPiece();
                }

                else if(i == 1) {
                    array[i][1] = ChessPiece.ROOK_WHITE.getPiece();
                    array[i][4] = ChessPiece.PAWN_BLACK.getPiece();
                    array[i][5] = ChessPiece.PAWN_BLACK.getPiece();
                    array[i][7] = ChessPiece.PAWN_BLACK.getPiece();
                }

                else if(i == 2) {
                    array[i][0] = ChessPiece.PAWN_BLACK.getPiece();
                    array[i][2] = ChessPiece.KNIGHT_BLACK.getPiece();
                    array[i][6] = ChessPiece.PAWN_BLACK.getPiece();
                }

                else if(i == 3) {
                    array[i][0] = ChessPiece.QUEEN_BLACK.getPiece();
                    array[i][3] = ChessPiece.BISHOP_WHITE.getPiece();
                }

                else if(i == 4) {
                    array[i][3] = ChessPiece.BISHOP_BLACK.getPiece();
                    array[i][4] = ChessPiece.PAWN_WHITE.getPiece();
                }

                else if(i == 5) {
                    array[i][4] = ChessPiece.BISHOP_WHITE.getPiece();
                    array[i][5] = ChessPiece.PAWN_WHITE.getPiece();
                }

                else if(i == 6) {
                    array[i][0] = ChessPiece.PAWN_WHITE.getPiece();
                    array[i][3] = ChessPiece.QUEEN_WHITE.getPiece();
                    array[i][5] = ChessPiece.PAWN_WHITE.getPiece();
                    array[i][7] = ChessPiece.PAWN_WHITE.getPiece();
                }

                else {
                    array[i][5] = ChessPiece.ROOK_WHITE.getPiece();
                    array[i][6] = ChessPiece.KING_WHITE.getPiece();
                }
            }
        }

        ChessBoard chessBoard = new ChessBoard(array);
        chessBoard.print();
    }
}
