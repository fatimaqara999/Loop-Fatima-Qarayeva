import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balans = 1000; // ilkin balans (istəsən dəyişə bilərsən)
        System.out.println("İlkin balans: " + balans);

        while (true) {
            System.out.print("Əməliyyat məbləğini daxil edin (dayandırmaq üçün 0): ");
            double meblegh = scanner.nextDouble();

            if (meblegh == 0) {
                break;
            }

            balans = balans + meblegh;
            System.out.println("Yeni balans: " + balans);

            if (balans < 0) {
                System.out.println("XƏBƏRDARLIQ: Balans mənfidir!");
            }
        }

        System.out.println("Kassa əməliyyatları tamamlandı. Son balans: " + balans);

        scanner.close();
    }
}