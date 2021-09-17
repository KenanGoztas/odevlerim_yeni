import java.util.Scanner;

public class artikYil_Hesaplama {
    public static void main(String[] args) {
        //schaltjahr leap artık yıl hesaplama
        // sayı sistemini diğer sisteme çevir formül yazacağız
        //format
        //asal sayılar
        //artık yıllar 100 yılda bir değişiyor mu, araştır
        // fibbionacci sayılarına bak
        //sayı sistemini tamamla


        Scanner myScan = new Scanner(System.in);
        /*while (true) {// schaltjahr, artık yıl bulma
            System.out.println("bir yıl giriniz");
            int yil = myScan.nextInt();
            if (yil % 4 == 0){
                if (yil %100 ==0){
                    if (yil%400 == 0)
                        System.out.println(yil + " yılı artık yıldır.");
                    else
                        System.out.println(yil + " yılı artık değildir.");
                }
                  else
                    System.out.println(yil + " yılı artık yıldır.");
            }
            else
                System.out.println(yil + " yılı artık yıl değildir.");
        }

         */
        // artık yılı tersten yazdım
        System.out.println("bir yıl giriniz");
        int tarih = myScan.nextInt();
        if ( tarih % 400 ==0) {
            System.out.println(tarih + " yılı artık yıldır.");
        }else {
            if (tarih % 100 == 0)
                System.out.println(tarih + " yılı artık yıl değildır.");
            else if (tarih% 4 ==0)
                System.out.println(tarih + " yılı artık yıldır.");
            else
                System.out.println(tarih + " yılı artık yıl değildır.");
        }

        //returnlu metodu cağırıyorum, burada değer veriyorum.
        System.out.println (metod_return_parametreli.artikYilHesaplama(tarih));


        if (metod_return_parametreli.artikYilHesaplama(tarih))
            System.out.println( tarih + " artık yıldır.");
        else
            System.out.println(tarih + " artık yıl değildir.");












    }
}