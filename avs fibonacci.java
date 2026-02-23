public class Main {
    public static void main(String[] args) {

        int[] a = {0, 1, 1, 2, 3, 5, 8, 13};

        int count = 2;   

        for (int i = 2; i < a.length; i++) {
            if (a[i] == a[i - 1] + a[i - 2]) {
                count++;
            } else {
                break;   
            }
        }

        System.out.println("Length of Fibonacci series = " + count);
    }
}
