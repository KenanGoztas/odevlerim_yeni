import java.util.Scanner;

public class onluksistemeceviri {
    public static int onluksisteme(int sistem, int sayi) {
        /*Scanner myScan = new Scanner(System.in);
        System.out.println("bir sayı sistemi seçiniz");
        int sistem = myScan.nextInt();
        System.out.println("bu sistemde bir sayı seçiniz");
        int sayi = myScan.nextInt();

         */
        int uzun = String.valueOf(sayi).length();
        int kalan = 0, onlukSayi = 0;

        for (int i = 0; i < uzun; i++) {
            kalan = sayi % 10;
            sayi /= 10;
            onlukSayi += kalan * Math.pow(sistem, i);
           // System.out.println(onlukSayi);
        }
        //System.out.println(onlukSayi);
        return onlukSayi;
    }


    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("bir sayı sistemi seçiniz");
        int sistem = myScan.nextInt();
        System.out.println("bu sistemde bir sayı seçiniz");
        int sayi = myScan.nextInt();
        int uzun = String.valueOf(sayi).length();
        int kalan = 0, onlukSayi = 0;

        for (int i= 0; i<uzun; i++) {
            kalan = sayi % 10;
            sayi /=10;
            onlukSayi += kalan* Math.pow(sistem, i);
            //System.out.println(onlukSayi);
        }System.out.println(onlukSayi);
        System.out.println("***");


        onluksisteme(2, 11101);
        //int j = onluksisteme(2, 11101);
        //System.out.println( " j = " +j  );




        String ikilik = "11101";
        System.out.println(Integer.valueOf(ikilik, 2));


        /* üslü sayılar işlemi
        for (int i = 1; i < us + 1; i++) {
            a = a * sayi;
            System.out.println(a);

         */



    }
}
