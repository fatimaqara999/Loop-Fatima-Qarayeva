import java.util.Scanner;

public class Tapsiriq5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlkin əmanət məbləğini daxil edin: ");
        double ilkinMebleg = scanner.nextDouble();

        System.out.print("İllik faiz dərəcəsini daxil edin (məs. 5 üçün 5 yazın): ");
        double faizDereesi = scanner.nextDouble();

        double hazirkiMebleg = ilkinMebleg;
        double hedef = ilkinMebleg * 2;
        int il = 0;

        while (hazirkiMebleg < hedef) {
            hazirkiMebleg = hazirkiMebleg + (hazirkiMebleg * faizDereesi / 100);
            il++;
            System.out.println(il + "-ci il: " + hazirkiMebleg);
        }

        System.out.println("Məbləğ " + il + " ildə iki qatına çatdı.");

        scanner.close();
    }
}