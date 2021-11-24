package code.indiana.chandisingh.minesweeper;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.println("How many tiles high do you want your board to be?");
        int boardHeight=scan.nextInt();

        System.out.println("How many tiles wide do you want your board to be?");
        int boardWidth=scan.nextInt();

        Board board=new Board();

        List gameBoard= board.setBoardList(boardHeight,boardWidth);
        System.out.println(gameBoard);

        boolean bombCheck=false;
        boolean boardCleared=false;


        while (!bombCheck && !boardCleared){
            System.out.println("What row do you want to check?");
            int row = scan.nextInt();
            System.out.println("what column do you want to check?");
            int col = scan.nextInt();
            board.editBoard(row,col);
            bombCheck=board.checkBombRevealed();
            boardCleared=board.checkBoardClear();
        }




        }
    }
