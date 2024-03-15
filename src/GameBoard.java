public class GameBoard {

 private String[] board;
    private String turn;

    public String[] getBoard() {
        return board;
    }

    public void setBoard(String[] board) {
        this.board = board;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public void gameBoard(){
        System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
        System.out.println("-+-+-");
        System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
        System.out.println("-+-+-");
        System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
    }

}
