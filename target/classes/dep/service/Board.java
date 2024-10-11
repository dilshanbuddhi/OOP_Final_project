package lk.ijse.dep.service;

public interface Board  {
    public static final int NUM_OF_COLS=5;
    public static final int NUM_OF_ROWS=6;

    BoardUI getBoardUI();
    int finfNextAvailableSpot(int col);

    boolean isLagalMove(int col);
    boolean existLegalMoves();
    void updateMove(int col , Piece move);
    Winner findWinner();
}
