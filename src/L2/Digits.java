package L2;

import java.util.ArrayList;

public class Digits {

    private final ArrayList<Integer> digitsList = new ArrayList<>();

    public static void main(String[] args) {
        var p = new Digits(1356);
        System.out.println(p.isStrictlyIncreasing());
    }

    public Digits(int num) {
        double n = (double) num;

        while (n >= 1) {
            int digit = (int) ((n % 10));

            digitsList.add(0, digit);

            n /= 10;
        }
    }

    public boolean isStrictlyIncreasing() {
        int prev = Integer.MIN_VALUE;

        for (int i: digitsList) {
            if (i < prev) {
                return false;
            }

            prev = i;
        };

        return true;
    }
}
