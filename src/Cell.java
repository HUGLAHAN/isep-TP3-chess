import lombok.Getter;
import lombok.Setter;
import pièce.Piece;

public class Cell {
    public final Position pos;
    @Getter @Setter
    private Piece piece;

    public Cell(Position pos){
        this.pos = pos;
    }
    public boolean isEmpty(){
        return piece==null;
    }
}