import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");

        int[] a = {10, 3, 4, 5, 9, 6};

        int max = a[0];
        int secondMax = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != max) {
                secondMax = a[i];
                break;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
        }

        System.out.println("Second Maximum = " + secondMax);
    }
}

