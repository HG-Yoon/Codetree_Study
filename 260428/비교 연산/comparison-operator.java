import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A >= B ? "1" : "0");
        System.out.println(A > B ? "1" : "0");
        System.out.println(B >= A ? "1" : "0");
        System.out.println(B > A ? "1" : "0");
        System.out.println(A == B ? "1" : "0");
        System.out.println(A != B ? "1" : "0");

        scanner.close();
    }
}