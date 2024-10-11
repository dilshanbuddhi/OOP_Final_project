package lk.ijse.dep.service;

public class BoardImpl implements Board{
    Piece [][]pieces= new Piece[NUM_OF_COLS][NUM_OF_ROWS];
    BoardUI boardUI;

    public BoardImpl(BoardUI boardUI) {
        this.boardUI = boardUI;
    }

    @Override
    public BoardUI getBoardUI() {
        return null;
    }

    @Override
    public int finfNextAvailableSpot(int col) {
        return 0;
    }

    @Override
    public boolean isLagalMove(int col) {
        return false;
    }

    @Override
    public boolean existLegalMoves() {
        return false;
    }

    @Override
    public void updateMove(int col, Piece move) {

    }

    @Override
    public Winner findWinner() {
        return null;
    }
}
