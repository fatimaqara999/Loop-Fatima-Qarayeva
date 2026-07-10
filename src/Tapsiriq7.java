import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gizli = 42;
        int cehd = 0;

        while (true) {
            System.out.print("Ədədi təxmin edin: ");
            int tehmin = scanner.nextInt();
            cehd++;

            if (tehmin > gizli) {
                System.out.println("Böyükdür");
            } else if (tehmin < gizli) {
                System.out.println("Kiçikdir");
            } else {
                System.out.println("Tapdın!");
                break;
            }
        }

        System.out.println("Ümumi cəhd sayı: " + cehd);

        scanner.close();
    }
}