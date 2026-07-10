import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sechim = -1;

        while (sechim != 0) {
            System.out.println("Menyu:");
            System.out.println("1) Cəm");
            System.out.println("2) Fərq");
            System.out.println("3) Hasil");
            System.out.println("4) Bölmə");
            System.out.println("0) Çıxış");
            System.out.print("Seçiminizi daxil edin: ");

            sechim = scanner.nextInt();

            if (sechim == 0) {
                System.out.println("Çıxış edilir...");
                break;
            }

            if (sechim < 1 || sechim > 4) {
                System.out.println("Yanlış seçim, yenidən cəhd edin.");
                continue;
            }

            System.out.print("Birinci ədədi daxil edin: ");
            double eded1 = scanner.nextDouble();

            System.out.print("İkinci ədədi daxil edin: ");
            double eded2 = scanner.nextDouble();

            double neticee;

            switch (sechim) {
                case 1:
                    neticee = eded1 + eded2;
                    System.out.println("Nəticə: " + neticee);
                    break;
                case 2:
                    neticee = eded1 - eded2;
                    System.out.println("Nəticə: " + neticee);
                    break;
                case 3:
                    neticee = eded1 * eded2;
                    System.out.println("Nəticə: " + neticee);
                    break;
                case 4:
                    if (eded2 == 0) {
                        System.out.println("Xəta: 0-a bölmək olmaz!");
                    } else {
                        neticee = eded1 / eded2;
                        System.out.println("Nəticə: " + neticee);
                    }
                    break;
            }
        }

        scanner.close();
    }
}