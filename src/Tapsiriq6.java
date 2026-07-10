import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nömrənin kod hissəsini daxil edin (məs. 050): ");
        String kod = scanner.nextLine();

        switch (kod) {
            case "050":
            case "051":
                System.out.println("Operator: Bakcell");
                break;
            case "070":
            case "077":
                System.out.println("Operator: Azercell");
                break;
            case "055":
            case "099":
                System.out.println("Operator: Nar");
                break;
            default:
                System.out.println("Naməlum operator");
        }

        scanner.close();
    }
}