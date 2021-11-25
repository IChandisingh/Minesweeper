package code.indiana.chandisingh.minesweeper;
import java.util.List;
public class Game {
    //////////////////////////Attributes/////////////////////////////
    boolean bombCheck;
    boolean boardCleared;
    boolean continueGame;
    Board board;

    /////////////////////////Constructs/////////////////////////////


    /////////////////////////Methods////////////////////////////////

    public void setBombCheck(boolean bombCheck) {
        this.bombCheck = bombCheck;
    }
    public boolean getBombCheck(){
        return this.bombCheck;
    }
    public void setBoardCleared(boolean boardCleared) {
        this.boardCleared = boardCleared;
    }
    public boolean getBoardCleared(){
        return this.boardCleared;
    }
    public boolean checkContinueGame(){
        continueGame=!bombCheck && !boardCleared;
        return continueGame;
    }
    public List startGame(int boardHeight,int boardWidth){
        board=new Board();
        List gameBoard= board.setBoardList(boardHeight,boardWidth);
        boolean bombCheck=false;
        boolean boardCleared=false;
        return gameBoard;
    }
    public void haveTurn(int row, int col){
        board.editBoard(row, col);
        bombCheck = board.checkBombRevealed();
        boardCleared = board.checkBoardClear();
    }
}
