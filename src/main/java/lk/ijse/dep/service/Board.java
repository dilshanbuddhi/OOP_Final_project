package lk.ijse.dep.service;

public interface Board  {
    public static final int NUM_OF_COLS=6;
    public static final int NUM_OF_ROWS=5;

    BoardUI getBoardUI();


    boolean isLegalMove(int col);

    boolean existLegalMove();

    int findNextAvailableSpot(int col);

    void updateMove(int col , Piece move);
    Winner findWinner();

    public void updateMove(int col, int row, Piece move);
}
