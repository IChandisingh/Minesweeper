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
        System.out.println(makeBoard(boardHeight,boardWidth));

        }





    }

