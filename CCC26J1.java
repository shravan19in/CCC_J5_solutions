import java.util.Scanner;

public class CCC26J1 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int numBesaWants = scan.nextInt();
        int numTotal = scan.nextInt();
        int numPurchased = scan.nextInt();
        if(numBesaWants <= (numTotal - numPurchased)){
            System.out.println("Y " + (numTotal - numPurchased - numBesaWants));
        }
        else{
            System.out.println("N");
        }
    }
}
