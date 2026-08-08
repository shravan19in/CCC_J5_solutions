import java.util.Scanner;

class Coord{
    int x;
    int y;
    boolean isSlimy;
    public Coord(int x, int y, boolean isSlimy){
        this.x = x;
        this.y = y;
        this.isSlimy = isSlimy;
    }
    public String toString(){
        return x + ", " + y + " isSlimy: " + isSlimy;
    }
}
public class CCC26J4 {
    public static int move(String direction, int numMoves, int currX, int currY, Coord[][] grid){
        int slimyCount = 0;
        if(direction.equals("S")){
            for (int i = 0; i < numMoves; i++) {
                currX--;
                //System.out.println(currX + " " + currY);
                if(grid[currX][currY] != null && grid[currX][currY].isSlimy){
                    slimyCount++;
                }
                else {
                    grid[currX][currY] = new Coord(currX, currY, true);
                }
            }
        }
        if(direction.equals("N")){
            for (int i = 0; i < numMoves; i++) {
                currX++;
                //System.out.println(currX + " " + currY);
                if(grid[currX][currY] != null && grid[currX][currY].isSlimy){
                    slimyCount++;
                }
                else {
                    grid[currX][currY] = new Coord(currX, currY, true);
                }
            }
        }
        if(direction.equals("E")){
            for (int i = 0; i < numMoves; i++) {
                currY++;
                //System.out.println(currX + " " + currY);
                if(grid[currX][currY] != null && grid[currX][currY].isSlimy){
                    slimyCount++;
                }
                else {
                    grid[currX][currY] = new Coord(currX, currY, true);
                }
            }
        }
        if(direction.equals("W")){
            for (int i = 0; i < numMoves; i++) {
                currY--;
                //System.out.println(currX + " " + currY);
                if(grid[currX][currY] != null && grid[currX][currY].isSlimy){
                    slimyCount++;
                }
                else {
                    grid[currX][currY] = new Coord(currX, currY, true);
                }
            }
        }
        return slimyCount;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numMovements = scan.nextInt();
        Coord[][] grid = new Coord[10000][10000];

        int slimy = 0;
        int currX = grid[0].length / 2;
        int currY = grid.length / 2;
        grid[currX][currY] = new Coord(currX, currY, true);
        for (int i = 0; i < numMovements; i++) {
            String move = scan.next();
            slimy += move(move.substring(0,1), Integer.parseInt(move.substring(1)), currX, currY, grid);
            if(move.substring(0,1).equals("S")){
                currX -= Integer.parseInt(move.substring(1));
            }
            if(move.substring(0,1).equals("N")){
                currX += Integer.parseInt(move.substring(1));
            }
            if (move.substring(0,1).equals("E")){
                currY += Integer.parseInt(move.substring(1));
            }
            if(move.substring(0,1).equals("W")){
                currY -= Integer.parseInt(move.substring(1));
            }
        }
        System.out.println(slimy);
    }
}
