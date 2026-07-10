import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Neçə bilet alırsınız: ");
        int biletSayi = scanner.nextInt();

        double umumiMebleg = 0;

        for (int i = 1; i <= biletSayi; i++) {
            System.out.print(i + "-ci biletin yaşını daxil edin: ");
            int yas = scanner.nextInt();

            double qiymet;

            if (yas <= 7) {
                qiymet = 0;
            } else if (yas <= 17) {
                qiymet = 3;
            } else if (yas <= 64) {
                qiymet = 7;
            } else {
                qiymet = 4;
            }

            System.out.println("Ödəniləcək məbləğ: " + qiymet + " AZN");
            umumiMebleg = umumiMebleg + qiymet;
        }

        System.out.println("Ümumi məbləğ: " + umumiMebleg + " AZN");

        scanner.close();
    }
}