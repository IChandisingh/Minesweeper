package code.indiana.chandisingh.minesweeper;
import java.util.ArrayList;
import java.util.List;


public class Board {
    //////////////////////////Attributes/////////////////////////////
    //private int boardHeight;
    //private int boardWidth;
    //number of bombs
    //board array?
     List<List> tileBoard = new ArrayList<>();
     //Tile[][] tileBoard;
     List<List> printBoard = new ArrayList<>();
     private int bombRevealed;
     private int numOfTiles;
     private int tilesChecked;
     private int numOfBombs;
     private int bombsPlaced;

    /////////////////////////Constructs/////////////////////////////



    /////////////////////////Methods////////////////////////////////


    public void setBombsPlaced(int num) {
        this.bombsPlaced=num;
    }

    public int getBombsPlaced() {
        return bombsPlaced;
    }

    public int getNumOfBombs() {
        return numOfBombs;
    }

    public void setNumOfBombs(int numOfBombs) {
        this.numOfBombs = numOfBombs;
    }

    public void setNumOfTiles(int height, int width){
        this.numOfTiles=height*width;
    }

    public int getNumOfTiles(){
        return this.numOfTiles;
    }

    public boolean checkBombRevealed(){
        return bombRevealed>0;
    }
    public void setTilesChecked(int num){
        this.tilesChecked=num;
    }
    public int getTilesChecked() {
        return this.tilesChecked;
    }
    public void setBombsRevealed(int num){
        this.bombRevealed=num;
    }
    public int getBombRevealed(){
        return this.bombRevealed;
    }

    public List setBoardList(int height, int width){    //makes array of tiles as the board - change to set num of bombs to count for test


        this.numOfBombs=(int) Math.round(numOfTiles/3f);

        this.numOfTiles=height*width;
        for (int i=0; i<height; i++) {
            List<Tile> tileRow = new ArrayList<>();
            List<Integer> printRow = new ArrayList<>();
            for (int n = 0; n < width; n++) {
                Tile tile = new Empty();
                tileRow.add(tile);
                printRow.add(0);
            }
            tileBoard.add(tileRow);
            printBoard.add(printRow);

        }
        while (bombsPlaced<numOfBombs){
            int randHeight= (int) (Math.random()*height);
            int randWidth= (int) (Math.random()*width);

            List obtainedRow = tileBoard.get(randHeight);
            Tile tile= (Tile) obtainedRow.get(randWidth);

            List obtainedPrintRow = printBoard.get(randHeight);
            int printTile= (int) obtainedPrintRow.get(randWidth);

            int index1 = obtainedRow.indexOf(tile);
            int index2=tileBoard.indexOf(obtainedRow);

            if (tile.getValue()<9){

                tile= new Bomb();
                printTile=tile.getValue();
                obtainedRow.set(index1, tile);
                obtainedPrintRow.set(index1,printTile);

                tileBoard.set(index2, obtainedRow);
                printBoard.set(index2,obtainedPrintRow);
                bombsPlaced++;
            }
        }

        return printBoard;
    }

    public void editBoardList(int row, int col){
        List obtainedRow = tileBoard.get(row);
        Tile tile= (Tile) obtainedRow.get(col);
        int check=tile.getValue();
        if (check==9){
            bombRevealed++;
        }
        else{
            //
        }
        tilesChecked++;
    }

    public boolean checkBoardClear() {
        return this.tilesChecked == this.numOfTiles;
    }



}
