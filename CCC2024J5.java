import java.util.Scanner;git init 

public class CCC2024J5 {
    public static int rec(String[][] patch, int curRow, int curCol){
        if(patch[curRow][curCol].equals("*")){
            return 0;
        }
        if(patch[curRow][curCol].equals("M")){
            patch[curRow][curCol] = "*";
            if(patch.length == 1){
                if(curCol == 0){
                    return 5 + rec(patch, curRow, curCol + 1);
                }
                if (curCol == patch[0].length - 1){
                    return 5 + rec(patch, curRow, curCol - 1);
                }
                return 5 + rec(patch, curRow, curCol-1) + rec(patch, curRow, curCol + 1);
            }
            if (patch[0].length == 1){
                if(curRow == 0){
                    return 5 + rec(patch, curRow + 1, curCol);
                }
                if (curRow == patch.length - 1){
                    return 5 + rec(patch, curRow - 1, curCol);
                }
                return 5 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol);
            }

            if(curRow == 0 && curCol == 0){
                return 5 + rec(patch, curRow + 1, curCol) + rec(patch, curRow, curCol + 1);
            }
            if(curRow == 0 && curCol == patch[0].length - 1){
                return 5 + rec(patch, curRow + 1, curCol) + rec(patch, curRow, curCol - 1);
            }
            if (curRow == patch.length - 1 && curCol == 0){
                return 5 + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1);
            }
            if (curRow == patch.length - 1 && curCol == patch[0].length - 1){
                return 5 + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol - 1);
            }



            if(curRow == 0){
                return 5 + rec(patch, curRow + 1, curCol) + rec(patch, curRow, curCol + 1) + rec(patch, curRow, curCol - 1);
            }
            if(curRow == patch.length - 1){
                return 5 + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1) + rec(patch, curRow, curCol - 1);
            }
            if(curCol == 0){
                return 5 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1);
            }
            if(curCol == patch[0].length - 1){
                return 5 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol - 1);
            }
            return 5 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1) + rec(patch, curRow, curCol - 1);
        }
        if(patch[curRow][curCol].equals("L")){
            patch[curRow][curCol] = "*";
            if(patch.length == 1){
                if(curCol == 0){
                    return 10 + rec(patch, curRow, curCol + 1);
                }
                if (curCol == patch[0].length - 1){
                    return 10 + rec(patch, curRow, curCol - 1);
                }
                return 10 + rec(patch, curRow, curCol-1) + rec(patch, curRow, curCol + 1);
            }
            if (patch[0].length == 1){
                if(curRow == 0){
                    return 10 + rec(patch, curRow + 1, curCol);
                }
                if (curRow == patch.length - 1){
                    return 10 + rec(patch, curRow - 1, curCol);
                }
                return 10 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol);
            }

            if(curRow == 0 && curCol == 0){
                return 10 + rec(patch, curRow + 1, curCol) + rec(patch, curRow, curCol + 1);
            }
            if(curRow == 0 && curCol == patch[0].length - 1){
                return 10 + rec(patch, curRow + 1, curCol) + rec(patch, curRow, curCol - 1);
            }
            if (curRow == patch.length - 1 && curCol == 0){
                return 10 + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1);
            }
            if (curRow == patch.length - 1 && curCol == patch[0].length - 1){
                return 10 + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol - 1);
            }


            if(curRow == 0){
                return 10 + rec(patch, curRow + 1, curCol) + rec(patch, curRow, curCol + 1) + rec(patch, curRow, curCol - 1);
            }
            if(curRow == patch.length - 1){
                return 10 + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1) + rec(patch, curRow, curCol - 1);
            }
            if(curCol == 0){
                return 10 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1);
            }
            if(curCol == patch[0].length - 1){
                return 10 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol - 1);
            }
            return 10 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1) + rec(patch, curRow, curCol - 1);
        }
        patch[curRow][curCol] = "*";
        if(patch.length == 1){
            if(curCol == 0){
                return 1 + rec(patch, curRow, curCol + 1);
            }
            if (curCol == patch[0].length - 1){
                return 1 + rec(patch, curRow, curCol - 1);
            }
            return 1 + rec(patch, curRow, curCol-1) + rec(patch, curRow, curCol + 1);
        }
        if (patch[0].length == 1){
            if(curRow == 0){
                return 1 + rec(patch, curRow + 1, curCol);
            }
            if (curRow == patch.length - 1){
                return 1 + rec(patch, curRow - 1, curCol);
            }
            return 1 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol);
        }

        if(curRow == 0 && curCol == 0){
            return 1 + rec(patch, curRow + 1, curCol) + rec(patch, curRow, curCol + 1);
        }
        if(curRow == 0 && curCol == patch[0].length - 1){
            return 1 + rec(patch, curRow + 1, curCol) + rec(patch, curRow, curCol - 1);
        }
        if (curRow == patch.length - 1 && curCol == 0){
            return 1 + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1);
        }
        if (curRow == patch.length - 1 && curCol == patch[0].length - 1){
            return 1 + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol - 1);
        }



        if(curRow == 0){
            return 1 + rec(patch, curRow + 1, curCol) + rec(patch, curRow, curCol + 1) + rec(patch, curRow, curCol - 1);
        }
        if(curRow == patch.length - 1){
            return 1 + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1) + rec(patch, curRow, curCol - 1);
        }
        if(curCol == 0){
            return 1 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1);
        }
        if(curCol == patch[0].length - 1){
            return 1 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol - 1);
        }
        return 1 + rec(patch, curRow + 1, curCol) + rec(patch, curRow - 1, curCol) + rec(patch, curRow, curCol + 1) + rec(patch, curRow, curCol - 1);


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        String[][] patch = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String input = scan.next();
            //System.out.println(input);
            for (int j = 0; j < cols; j++) {
                patch[i][j] = String.valueOf(input.charAt(j));
            }
        }
        /*for (int i = 0; i < patch.length; i++) {
            for (int j = 0; j < patch[0].length; j++) {
                System.out.print(patch[i][j] + " ");
            }
            System.out.println();
        }*/
        int startRow = scan.nextInt();
        int startCol = scan.nextInt();

        if(rows == 1 && cols == 1){
            if (patch[0][0].equals("L")) System.out.println(10);
            if (patch[0][0].equals("M")) System.out.println(5);
            if (patch[0][0].equals("S")) System.out.println(1);
        }
        else System.out.println(rec(patch, startRow, startCol));
    }
}