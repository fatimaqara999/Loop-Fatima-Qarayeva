import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxQol = -1;
        int maxOyunchu = -1;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "-ci oyunçunun qol sayını daxil edin: ");
            int qol = scanner.nextInt();

            if (qol > maxQol) {
                maxQol = qol;
                maxOyunchu = i;
            }
        }

        System.out.println("Ən çox qol vuran oyunçu: " + maxOyunchu + ", Qol sayı: " + maxQol);

        scanner.close();
    }
}