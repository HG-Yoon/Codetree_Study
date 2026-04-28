import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if(N < 0) {
            System.out.println(N);
            System.out.println("minus");
        } else {
            System.out.println(N);
        }

        scanner.close();
    }
}