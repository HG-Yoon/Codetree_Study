import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double shortN = Math.round(N * 100) / 100.0;
        System.out.printf("%.2f", shortN);
        sc.close();
    }
}