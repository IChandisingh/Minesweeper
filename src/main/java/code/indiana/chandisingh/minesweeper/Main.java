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

        Game game=new Game();
        System.out.println(game.startGame(boardHeight,boardWidth));



        while (game.checkContinueGame()) {
            System.out.println("What row do you want to check?");
            int row = scan.nextInt();
            System.out.println("what column do you want to check?");
            int col = scan.nextInt();
            game.haveTurn(row,col);
        }




        }
    }
