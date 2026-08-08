import java.util.Scanner;

public class CCC26J2 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();
        int s5 = scan.nextInt();
        int diffScore = scan.nextInt();
        int[] arr = {s1, s2, s3, s4, s5};
        int max = -1;
        int min = 11;
        int maxIndex = -1;
        int minIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i != minIndex && i != maxIndex){
                sum += arr[i];
            }
        }
        sum *= diffScore;
        System.out.println(sum);
    }
}
