
import java.util.Scanner;
/*
programın iki hatası var
1. sistem dışında sayı girilirse engellemiyor.
2. 16lık sayı sistemininin harflerini tanımıyor,
3, ilk ifde seçim>3 yaparsak whilenin içine giriyor ve bu if çalışıyor??
*/
public class sayiSistemleriTam {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int secim = 0, i;
        while (secim !=4) {
            int sonuc = 0;
            System.out.println("*****");
            System.out.println("bir işlem seçiniz.");
            System.out.println("1. diğer sistemlerden 10luk sisteme çevir");
            System.out.println("2. 10luk sistemden diğer sisteme çevir");
            System.out.println("3. sayı sistemleri arası çevir");
            System.out.println("4. Çıkış");
            secim = myScan.nextInt();
            //if (secim ==3)
               // break;
            if (secim > 4 || secim < 1) {
            System.out.println("yanlış seçim!!");
                continue;
            }
            else if (secim == 1) {
                System.out.println("bir sayı sistemi seçiniz");
                int sistem = myScan.nextInt();
                System.out.println("bu sistemde bir sayı seçiniz");
                int sayi = myScan.nextInt();
                int uzun = String.valueOf(sayi).length();
                int kalan = 0, onlukSayi = 0;
                for (i= 0; i<uzun; i++) {
                    kalan = sayi % 10;
                    sayi /=10;
                    onlukSayi += kalan* Math.pow(sistem, i);
                }
                System.out.println(onlukSayi);
            }
            else  if (secim ==2){
                System.out.println("bir sayı giriniz");
                int sayi = myScan.nextInt();
                System.out.println("hangi sayı sistemine çevirmek istersiniz");
                int sistem = myScan.nextInt();
                int mod = 0;
                String str ="";
                for (i = 0; sayi > 0; i++) {
                    mod = sayi % sistem;
                    sayi /= sistem;
                    str = mod + str ;
                }
                System.out.println(str);
            }
            else if (secim ==3){
                System.out.println("bir sayı sistemi seçiniz");
                int sistem = myScan.nextInt();
                System.out.println("bu sistemde bir sayı seçiniz");
                int sayi = myScan.nextInt();
                int uzun = String.valueOf(sayi).length();
                int kalan = 0, onlukSayi = 0;
                for (i= 0; i<uzun; i++) {
                    kalan = sayi % 10;
                    sayi /= 10;
                    onlukSayi += kalan * Math.pow(sistem, i);
                }
                System.out.println("hangi sayı sistemine çevirmek istersiniz");
                int sistem1 = myScan.nextInt();
                int mod = 0;
                String str ="";
                for (i = 0; onlukSayi > 0; i++) {
                    mod = onlukSayi % sistem1;
                    onlukSayi /= sistem1;
                    str = mod + str ;
                }
                System.out.println(str);
            }
        }
        System.out.println("teşekkür ederiz!!");




    }
}