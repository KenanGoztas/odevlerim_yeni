import java.util.Scanner;
// onluk sistemini diğer sayı sistemlerine çevirme
public class onlukSistemdenCevir {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        // ONLUK sistemden diğer sistemlere çevirme
        while (true) {
            System.out.println("bir sayı giriniz");
            int sayi = myScan.nextInt();
            System.out.println("hangi sayı sistemine çevirmek istersiniz");
            int sistem = myScan.nextInt();
            int mod = 0;
            String str ="";
            for (int i = 0; sayi > 0; i++) {
                mod = sayi % sistem;
                sayi /= sistem;
                str = mod + str ;
            }
            System.out.println(str);
            System.out.println("***");
        }




























    }
}
