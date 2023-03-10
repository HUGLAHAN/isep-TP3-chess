public class Chess {
    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;
    // On decrit brievement la logique du jeu
    public void play() {
        while (true) {
            createPlayers();
            initialiseBoard();
            while (!isCheckMate()) {
                printBoard();
                String move;
                do {
                    move = askMove();
                }
                while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }
    }
// On declare et implemente les autres methodes mentionnees plus haut
}