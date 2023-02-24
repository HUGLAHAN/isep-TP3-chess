package pièce;

public abstract class Piece {
    final public boolean color;

    public Piece(boolean color) {
        this.color = color;
    }
    public abstract String name();
    public String colorName(){
        return color?"w":"b";
    }
}
