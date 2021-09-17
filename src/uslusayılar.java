import java.util.Scanner;

public class uslusayılar {
    public static int us (int sayi, int üs){
       if (üs <1)
        return 1;
       else
        return sayi * us( sayi, üs -1 );


    }
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int a = 1, b = 0;
        System.out.println("bir sayı giriniz");
        int sayi = myScan.nextInt();
        System.out.println("kaçıncı üssü olmasını istiyorsunuz");
        int us = myScan.nextInt();
        for (int i = 1; i < us + 1; i++) {
            a = a * sayi;
            System.out.println(a);
        }
        System.out.println(a);
        System.out.println("*****");

        System.out.println(us(sayi, us));



    }
}