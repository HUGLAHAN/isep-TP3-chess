package pièce;

public class King extends Piece {

    public King(boolean color) {
        super(color);
    }

    @Override
    public String name() {
        return "K"+colorName();
    }
}

