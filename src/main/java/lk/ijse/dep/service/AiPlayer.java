package lk.ijse.dep.service;

public class AiPlayer extends Player {
    public AiPlayer(Board newBoard) {
        super(newBoard);
    }

    @Override
    public void movePiece(int col) {

        int x = colChosser();
        if (x == -1){  // colChosser() eken pass kale -1 da balanawa, ow nam random kallak danawa
            do {
                col = (int)(Math.random() * 6 );

            }while (!board.isLegalMove(col));

        }else {
            col = x;
        }
        board.updateMove(col,board.findNextAvailableSpot(col),Piece.GREEN);
        board.getBoardUI().update(col,false);
        if (board.findWinner().getWinningPiece() == Piece.EMPTY){
            if (!board.existLegalMove()){
                board.getBoardUI().notifyWinner(new Winner(Piece.EMPTY));
            }
        }else {
            board.getBoardUI().notifyWinner(board.findWinner());
        }
    }
    private int colChosser() {

        for (int i = 0; i < board.NUM_OF_COLS; i++) {
            if (board.isLegalMove(i) ){
                int row = board.findNextAvailableSpot(i);
                board.updateMove(i,Piece.GREEN); // ai ge pic ekak danawa i column ekata
                if (board.findWinner().getWinningPiece() == Piece.GREEN) {

                    board.updateMove(i, row, Piece.EMPTY);
                    return i;
                }
                else{
                    board.updateMove(i, row, Piece.EMPTY); //ema kalla dinanna hethuwak wenne naththam eka EMPTY karanawa
                }
            }
        }

        for (int i = 0; i < board.NUM_OF_COLS; i++) {
            if (board.isLegalMove(i) ){
                int row = board.findNextAvailableSpot(i);
                board.updateMove(i,Piece.BLUE);
                if (board.findWinner().getWinningPiece() == Piece.BLUE) { // ee kalla dammama human player win karanawada balanawa

                    board.updateMove(i, row, Piece.EMPTY);
                    return i;
                }
                else{
                    board.updateMove(i, row, Piece.EMPTY);
                }
            }
        }
        return -1;
    }
}