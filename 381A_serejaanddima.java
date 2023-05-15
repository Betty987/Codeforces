
import java.util.Scanner;
//T:O(n), S:O(n)
 
public class serejaanddima {
    public static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        int n = sc.nextInt(),leftPos = 0, rightPos = n - 1, serejaSum = 0, dimaSum = 0;
        int[] record = new int[n];
        for (int i = 0; i < n; i++) {
            record[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (record[leftPos] >= record[rightPos]) {
                //if it is sereja's turn
                if (i % 2 == 0) {
                    serejaSum += record[leftPos++];
                } else {
                    dimaSum += record[leftPos++];
                }
            } else {
                if (i % 2 == 0) {
                    serejaSum += record[rightPos--];
                } else {
                    dimaSum += record[rightPos--];
                }
            }
        }
        System.out.println(serejaSum + " " + dimaSum);
    }
}
