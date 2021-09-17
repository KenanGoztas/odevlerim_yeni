import java.util.Scanner;

public class ciftlerinToplamı {
    public static int cifttop(int a) {
        if (a == 0)
            return 0;
        else if (a % 2 == 0)
            return a + cifttop(a - 2) - 2;
        else
            return cifttop(a - 1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int b = 0;
        System.out.print("lütfen bir sayı giriniz : ");
        int yaz = scan.nextInt();
        for (i = 0; i < yaz; i++) {
            if (i % 2 == 0) {
                b += i;
            }
            System.out.println(b);
        }
        System.out.println();
        System.out.println("sıfırdan " + yaz + "'a kadar olan  çift sayıların toplamı = " + b);
        System.out.println();

        /* !!!neden çalışmadı? buraya if modunu for içerisine && ve ile ekledim. kod daha kısa ve sade oldu.
        b = 0;
        i = 0;
        for (i = 0 ; i < yaz || i % 2 == 0 ; ++i){
                b+=i;
            System.out.println(b);
        }
        System.out.println();
        System.out.println("sıfırdan " + yaz + "'a kadar olan  çift sayıların toplamı = " + b);
        System.out.println();

         */

        i = 0;
        b = 0;
        while (i < yaz) {
            if (i % 2 == 0) {
                b += i;
            }
            i++;
            System.out.println(b);

        }
        System.out.println();
        System.out.println("sıfırdan " + yaz + "'a kadar olan  çift sayıların toplamı = " + b);
        System.out.println();

        i = 0;
        b = 0;
        do {
            if (i % 2 == 0) {
                b += i;
            }
            i++;
            System.out.println(b);
        } while (i < yaz);
        System.out.println();
        System.out.println("sıfırdan " + yaz + "'a kadar olan  çift sayıların toplamı = " + b);
        System.out.println("***");
        System.out.println(cifttop(yaz));


    }
}
