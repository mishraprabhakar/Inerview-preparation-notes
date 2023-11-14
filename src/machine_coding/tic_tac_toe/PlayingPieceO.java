package machine_coding.tic_tac_toe;

public class PlayingPieceO extends PlayingPiece{
    public PlayingPieceO() {
        super(PieceType.O);
    }

    @Override
    public String toString() {
        return PieceType.O.name();
    }
}
