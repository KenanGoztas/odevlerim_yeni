import java.util.Scanner;

public class metod_return {
    public static boolean artikYilHesaplama() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("bir yıl giriniz");
        int tarih = myScan.nextInt();
        if (tarih % 400 == 0) {
            return true;
        } else {
            if (tarih % 100 == 0)
                return false;
            else if (tarih % 4 == 0)
                return true;
            else
                return false;
        }
    }

    public static boolean asalSayilar() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = myScan.nextInt();
        int kalan = 1;

        for (int i = 1; i < sayi / 2; i++) {
            kalan = sayi % (i + 1);
            if (kalan == 0)
                break;
        }
        if (kalan == 0)
            return false;
        else
            return true;
    }


    public static int sayiSistemiCevir () {
        Scanner myScan = new Scanner(System.in);
        int secim = 0, i;
        System.out.println("*****");
        System.out.println("bir işlem seçiniz.");
        System.out.println("1. diğer sistemlerden 10luk sisteme çevir");
        System.out.println("2. 10luk sistemden diğer sisteme çevir");
        System.out.println("3. sayı sistemleri arası çevir");
        System.out.println("4. Çıkış");
        secim = myScan.nextInt();
        if (secim > 4 || secim < 1) {
            System.out.println("yanlış seçim!!");
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
            return onlukSayi;
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
            return Integer.parseInt(str);

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
            return Integer.parseInt(str);
        }
        return secim;
    }

    public static int birSayininBolenleri () {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int girdi = scan.nextInt();
        System.out.print(girdi + " sayısının bölenleri =  ");
        for (int i = 1; i <= girdi/2; i++){
            if (girdi%i == 0) {
                System.out.print(i +" - ");
            }
        }
        return girdi;
    }

    public static int faktoriyel () {
        Scanner scan = new Scanner(System.in);
        System.out.print("faktöriyelini almak istediğiniz sayı : ");
        int girdi = scan.nextInt();
        int b = 1;
        for (int i = 1; i <= girdi; i++) {
            b *= i;
        }
        System.out.println(girdi + " ! = " + b);
        return b;
    }

    public static void fibonacci () {
        Scanner myScan = new Scanner(System.in);
        System.out.println("fibonacci için adım sayısını giriniz");
        int girdi = myScan.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print(a + " - " + b );
        for (int i = 0; i < girdi - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" - " + c);
        }
    }
    public static int quersumme () {
        Scanner myScan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = myScan.nextInt();
        int sonuc = 0;
        for (int i =0; 0 < sayi; i++){
            sonuc += (sayi % 10);
            sayi = sayi/10;
        }
        return sonuc;
    }

    public static int usluSayilar () {
        Scanner myScan = new Scanner(System.in);
        int a = 1;
        System.out.println("bir sayı giriniz");
        int sayi = myScan.nextInt();
        System.out.println("kaçıncı üssü olmasını istiyorsunuz");
        int us = myScan.nextInt();
        for (int i = 1; i < us + 1; i++) {
            a = a * sayi;
        }
        return a;
    }

    public static boolean palindrom () {
        Scanner myScan = new Scanner(System.in);
        String yeni ="";
        System.out.println("bir kelime giriniz");
        String kelime = myScan.next(); //nextLine yazınca çalışmadıNEDEN??
        int a = kelime.length();
        for (int i = 0; i <a; i++) {
            yeni += kelime.charAt(a - 1 - i);
        }
        if(yeni.equals(kelime)) {
            return true;
        }
        else {
            return false;
        }
    }



    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int secim = 0;
        while (true) {
            System.out.println();
            System.out.println("***");
            System.out.println("bir işlem seçiniz.");
            System.out.println("1. artık yıl hesaplama");
            System.out.println("2. asal sayılar");
            System.out.println("3. sayı sistemi değiştir");
            System.out.println("4. bir sayının bölenleri");
            System.out.println("5. faktoriyel ");
            System.out.println("6. fibonacci");
            System.out.println("7. quersumme, verilen sayının rakamlarını topla");
            System.out.println("8. üslü sayılar");
            System.out.println("9. Palindrom bulma");
            System.out.println("10. Çıkış");
            secim = myScan.nextInt();
            if (secim ==10)
                break;
            if (secim > 10 || secim < 1) {
                System.out.println("yanlış seçim!!");
                continue;
            }
            else if (secim == 1){
                if (artikYilHesaplama())
                System.out.println("artık yıldır");
                else
                    System.out.println("artık yıl değildir");
            }
            else if (secim == 2){
                if (asalSayilar())
                    System.out.println("asal sayıdır");
                else
                    System.out.println("asal sayı değildir");
            }
            else if (secim == 3){
                System.out.println(sayiSistemiCevir());
            }
            else if (secim == 4){
                System.out.println(birSayininBolenleri());
            }
            else if (secim == 5){
                System.out.println(faktoriyel());
            }
            else if (secim == 6) {
                fibonacci();
            }
            else if (secim == 7) {
                System.out.println(quersumme());
            }
            else if (secim == 8) {
                System.out.println(usluSayilar());
            }
            else if (secim == 9) {
                if (palindrom())
                    System.out.println("girilen kelime palindromdur");
                else
                    System.out.println("girilen kelime palindrom değildir");
            }
        }
        System.out.println("Teşekkür ederiz!");







    }
}
