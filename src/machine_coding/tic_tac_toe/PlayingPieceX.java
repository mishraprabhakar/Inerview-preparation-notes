package machine_coding.tic_tac_toe;

public class PlayingPieceX extends PlayingPiece{
    public PlayingPieceX() {
        super(PieceType.X);
    }

    @Override
    public String toString() {
        return PieceType.X.name();
    }
}
