package code.indiana.chandisingh.minesweeper;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.println("How many tiles high do you want your board to be?");
        int boardHeight=scan.nextInt();

        System.out.println("How many tiles wide do you want your board to be?");
        int boardWidth=scan.nextInt();

        //Board=makeBoard(boardHeight,boardWidth)
        Board board=new Board();
        board.setBoardList(boardHeight,boardWidth);

        boolean bombCheck=false;
        boolean boardCleared=false;

        while (!bombCheck && !boardCleared){
            System.out.println("What row do you want to check?");
            int row = scan.nextInt();
            System.out.println("what column do you want to check?");
            int col = scan.nextInt();

            board.editBoardList(row,col);
            bombCheck=board.checkBombRevealed();
            boardCleared=board.checkBoardClear();
        }



        //String gameBoard=board.boardList.toString();
        //System.out.println(gameBoard);


        /*/////////////Testing bomb count variable works//////////////////
        System.out.println( board.checkBombRevealed());
        System.out.println("Do you want to explode a bomb?");
        int explode =scan.nextInt();
        board.setBombRevealed(explode);
        System.out.println( board.checkBombRevealed());
         */


        }
    }
