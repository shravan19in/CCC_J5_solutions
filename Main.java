import java.util.HashMap;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> lights = new HashMap<>();
        int numParking = scan.nextInt();
        boolean[] isLighted = new boolean[numParking];
        for (int i = 0; i < isLighted.length; i++) {
            isLighted[i] = false;
        }
        int numLights = scan.nextInt();
        int[] keys = new int[numLights];
        int[] values = new int[numLights];
        int numQuestions = scan.nextInt();
        for (int i = 0; i < numLights; i++) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            lights.put(num1 - 1, num2);
            keys[i]  = num1 - 1;
            values[i] = num2;
        }
        for (int i = 0; i < numLights; i++) {
            isLighted[keys[i]] = true;
        }
        for (int i = 0; i < numLights; i++) {
            for (int j = 1; j <= values[i]; j++) {
                if(keys[i] + j <= isLighted.length){
                    isLighted[keys[i] + j] = true;
                }
                if(keys[i] - j >= 0){
                    isLighted[keys[i] - j] = true;
                }
            }
        }
        for (int i = 0; i < numQuestions; i++) {
            int num = scan.nextInt();
            if(isLighted[num - 1]){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }

    }
}