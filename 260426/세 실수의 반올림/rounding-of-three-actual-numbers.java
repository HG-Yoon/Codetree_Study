import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double shortA = Math.round(a * 1000) / 1000.0;
        double shortB = Math.round(b * 1000) / 1000.0;
        double shortC = Math.round(c * 1000) / 1000.0;
        System.out.printf("%.3f\n", shortA);
        System.out.printf("%.3f\n", shortB);
        System.out.printf("%.3f\n", shortC);
        sc.close();
    }
}