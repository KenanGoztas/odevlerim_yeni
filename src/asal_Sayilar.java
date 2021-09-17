import java.util.Scanner;

public class asal_Sayilar {
   /* public static boolean recasal(int a) {
        boolean bool = true;
        if (a ==1)
            return true;
         if (a==2 || a / recasal(a-1) == 0)
             return false;

        return true;
    }*/

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = myScan.nextInt();
        int kalan = 1;
        for (int i = 1; i<sayi/2; i++ ) {
            kalan = sayi % (i+1);
            if (kalan == 0)
                break;
        }
            if (kalan == 0)
                System.out.println( sayi + " sayısı asal değildir.");
            else
                System.out.println(sayi + " sayısı asaldır.");

        System.out.println(metod_return_parametreli.asalSayilar(sayi));
        System.out.println("*****");

        //System.out.println(recasal(sayi));

    }
}
