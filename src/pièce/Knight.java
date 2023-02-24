package pièce;

public class Knight extends Piece {

    public Knight(boolean color) {
        super(color);
    }

    @Override
    public String name() {
        return "N"+colorName();
    }
}

