package pattern;

public class NumberBorderSquare {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {

                int t = i;
                int l = j;
                int b = (2 * n - 2) - i;
                int r = (2 * n - 2) - j;

                int minDist = Math.min(Math.min(t, b), Math.min(l, r));

                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }
    }


}