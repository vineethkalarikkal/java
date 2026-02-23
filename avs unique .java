\public class Main {
    public static void main(String[] args) {

        int[] a = {10, 3, 4, 3, 5, 10, 6};

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(a[i]);
            }
        }
    }
}


        

       