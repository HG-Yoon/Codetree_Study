import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int sum = A + B;
        double avg = sum / 2.0;

        System.out.printf("%d %.1f", sum, avg);

        scanner.close();
    }
}