package lab1;

public class Proga4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("H%d = %.4f%n", i, harmonic(i));
        }
    }

    public static double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
