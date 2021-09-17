import java.util.Scanner;

public class islemlerim_do_while {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int secim, sayi1 = 0, sayi2 = 0, sonuc, i;
        do {
            sonuc = 0;
            System.out.println();
            System.out.println("bir işlem seçiniz.");
            System.out.println("1. verilen sayıya kadar toplama işlemi");
            System.out.println("2. verilen sayıya kadar çiftlerin toplamı");
            System.out.println("3. verilen sayıya kadar teklerin toplaı");
            System.out.println("4. toplayarak çarpma işlemi");
            System.out.println("5. faktoriyel ");
            System.out.println("6. polindrom kontrolü");
            System.out.println("7. Çıkış");
            secim = myScan.nextInt();
            if (secim == 7)
                break;
            if (secim > 7 || secim < 1) {
                System.out.println("yanlış seçim!!");
                continue;
            } else if (secim == 6) {
                String yeni = "";
                System.out.println("bir kelime giriniz");
                String kelime = myScan.next(); //nextLine yazınca çalışmadıNEDEN??
                int a = kelime.length();
                for (i = 0; i < a; i++) {
                    yeni += kelime.charAt(a - 1 - i);
                }
                if (yeni.equals(kelime)) {
                    System.out.println("Girilen kelime Palindrom bir kelimedir.");
                } else {
                    System.out.println("Girdiginiz kelime Palindrom bir kelime degildir.");
                }
            } else {
                System.out.println("bir sayı giriniz");
                sayi1 = myScan.nextInt();

                if (secim == 1) {
                    for (i = 0; i < sayi1; i++) {
                        sonuc += i;
                    }
                    System.out.println("sıfırdan " + sayi1 + "'a kadar olan sayıların toplamı = " + sonuc);

                }
                if (secim == 2) {
                    for (i = 0; i < sayi1; i++) {
                        if (i % 2 == 0) {
                            sonuc += i;
                        }
                    }
                    System.out.println("sıfırdan " + sayi1 + "'a kadar olan  çift sayıların toplamı = " + sonuc);
                }
                if (secim == 3) {
                    for (i = 0; i < sayi1; i++) {
                        if (i % 2 == 1) {
                            sonuc += i;
                        }
                    }
                    System.out.println("sıfırdan " + sayi1 + "'a kadar olan  tek sayıların toplamı = " + sonuc);
                }
                if (secim == 4) {
                    System.out.println("bir sayı daha giriniz");
                    sayi2 = myScan.nextInt();
                    int kucuk = sayi1;
                    int buyuk = sayi2;
                    if (sayi1 > sayi2) {
                        kucuk = sayi2;
                        buyuk = sayi1;
                    }
                    for (i = 0; i < kucuk; i++) {
                        sonuc += buyuk;
                    }
                    System.out.println(sayi1 + " X " + sayi2 + " = " + sonuc);
                }
                if (secim == 5) {
                    sonuc = 1;
                    for (i = 1; i <= sayi1; i++) {
                        sonuc *= i;
                    }
                    System.out.println(+sayi1 + " sayısının faktoriyeli = " + sonuc);
                }
            }
        } while (true); //burada true olmasının anlamı ve sonuçları nelerdir bilmiyorum.

        System.out.println("teşekkür ederiz.");


    }
}
