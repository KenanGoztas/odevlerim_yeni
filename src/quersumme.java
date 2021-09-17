import java.util.Scanner;

public class quersumme {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        int sayi = myScan.nextInt();
        String str = String.valueOf(sayi);
        int a = 0, b, c = 0;
        for (int i = 0; i < str.length(); i++) {
            a = sayi % 10;
            b = ((sayi - a) / 10);
            sayi = b;
            c +=a;
            System.out.println(c);
            }
        System.out.println(c);
        System.out.println("****");

        int sayi2 = 1354544, sonuc = 0;
        String str2 = String.valueOf(sayi2);
        for (int i =0; i < str2.length(); i++){
            sonuc += (sayi2 % 10);
            sayi2 = sayi2/10;
            System.out.println(sonuc);
        }System.out.println(sonuc);
        System.out.println("!!!!!!");


        int sayi3 = 1354554, sonuc3 = 0;
        while (sayi3>0) {
            sonuc3 += sayi3 %10;
            sayi3 = sayi3/10;
            System.out.println(sonuc3);
        }
        System.out.println(sonuc3);
        System.out.println("///////");

        int sayi4 = 1354544, sonuc4 = 0;
        for (int i =0; 0 < sayi4; i++){
            sonuc4 += sayi4 % 10;
            sayi4 = sayi4/10;
            System.out.println(sonuc4);
        }System.out.println(sonuc4);

        System.out.println("!!!!!!");
        int sa = myScan.nextInt();
        System.out.println(recquer(sa));

    }
    public static int recquer (int sayi){ //kendim yaptım. zor dldu ama çok basitmiş.

        if (sayi == sayi %10)
            return sayi;
        else
        return sayi %10 + recquer(sayi/10);

    }
}
