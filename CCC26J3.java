import java.util.Scanner;

public class CCC26J3 {
    public static String winner(String ngocCandy, String minhCandy){
        if(ngocCandy.charAt(0) == 'R'){
            if(minhCandy.charAt(0) == 'G'){
                return "ngoc";
            }
            if(minhCandy.charAt(0) == 'B'){
                return "minh";
            }
        }
        if(ngocCandy.charAt(0) == 'G'){
            if(minhCandy.charAt(0) == 'B'){
                return "ngoc";
            }
            if(minhCandy.charAt(0) == 'R'){
                return "minh";
            }
        }
        if(ngocCandy.charAt(0) == 'B'){
            if(minhCandy.charAt(0) == 'R'){
                return "ngoc";
            }
            if(minhCandy.charAt(0) == 'G'){
                return "minh";
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ngocCandy = scan.next();
        String minhCandy = scan.next();
        int ngocScore = 0;
        int minhScore = 0;
        while(!ngocCandy.isEmpty() && !minhCandy.isEmpty()){
            if(ngocCandy.charAt(0) == minhCandy.charAt(0)){
                ngocCandy = ngocCandy.substring(1);
                minhCandy = minhCandy.substring(1);
                ngocScore++;
                minhScore++;
            } else if (winner(ngocCandy, minhCandy).equals("ngoc")) {
                minhCandy = minhCandy.substring(1);
                ngocScore++;
            } else if (winner(ngocCandy, minhCandy).equals("minh")) {
                ngocCandy = ngocCandy.substring(1);
                minhScore++;
            }

        }

        if(ngocCandy.length() == 0){
            System.out.println(ngocScore);
            System.out.println(minhScore + minhCandy.length());
        }
        else if(minhCandy.length() == 0){
            System.out.println(ngocScore + ngocCandy.length());
            System.out.println(minhScore);;
        }
    }
}
