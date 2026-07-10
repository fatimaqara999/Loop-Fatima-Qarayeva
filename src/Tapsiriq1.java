import java.util.Scanner;
public class Tapsiriq1 {
     public static void main(String[] argsr) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bali daxil edin");
    int bal=scanner.nextInt();
    String qiymet;
    if ( bal >= 90) {
        qiymet = "ela";
    } else if (bal >=70 ) {
        qiymet = "yaxsi";
    } else if (bal >=50) {
        qiymet = "kafi";
    } else {
        qiymet = "Qeyri-kafi";
    }
    System.out.println(" Bal: " +bal+  " Qiymet: " + qiymet );

    scanner.close();
         }

     }

