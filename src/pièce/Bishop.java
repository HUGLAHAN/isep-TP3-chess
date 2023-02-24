package pièce;

public class Bishop extends Piece {

    public Bishop(boolean color) {
        super(color);
    }

    @Override
    public String name() {
        return "B"+colorName();
    }
}

