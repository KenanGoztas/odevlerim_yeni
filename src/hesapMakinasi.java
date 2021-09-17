import java.util.Scanner;

public class hesapMakinasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secim, sayi1, sayi2, sonuc = 0;
        System.out.println("yapmak istediğiniz işlemi seciniz: ");
        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\n5. Çıkış");
        secim = scan.nextInt();

        while (secim < 1 || secim > 5) { //burayı zor da olsa anladım. 1,2,3,4 harici sayılarda burayı işlet diyor
            System.out.print("hatalı sayı girdiniz. lütfen işlemi seçiniz= ");
            System.out.println();
            System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\n5. Çıkış");
            secim = scan.nextInt();
        }

        while (secim != 5) { // buradaki ifadeyi anlamadım, 5 çıkış için kullanmasak olmaz mı
                System.out.println("iki tamsayı giriniz");
                sayi1 = scan.nextInt();
                sayi2 = scan.nextInt();
                if (secim == 1) {
                    sonuc = sayi1 + sayi2;
                    System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
                } else if (secim == 2) {
                    sonuc = sayi1 - sayi2;
                    System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
                } else if (secim == 3) {
                    sonuc = sayi1 * sayi2;
                    System.out.println(sayi1 + " * " + sayi2 + " = " + sonuc);
                } else if (secim == 4) {
                    sonuc = sayi1 / sayi2;
                    System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc);
                } else { // buraya gerek var mı? yok gibi duruyor.
                    System.out.println("geçersiz seçim");
                }

                scan.nextLine();
                scan.nextLine();
                System.out.println("yapmak istediğiniz işlemi seciniz: ");
                System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\n5. Çıkış");
                secim = scan.nextInt();

                while (secim < 1 || secim > 5) {
                    System.out.print("hatalı sayı girdiniz. lütfen işlemi seçiniz= ");
                    System.out.println();
                    System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\n5. Çıkış");
                    secim = scan.nextInt();
                }

        }
        System.out.println("teşekkür ederiz");





















    }
}
