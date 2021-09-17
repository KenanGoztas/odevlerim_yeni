import java.util.Scanner;

public class toplayarakCarpmaIslemi {
    public static int rectopçarp (int a, int b) {
        if (b==1)
            return a;
        return a + rectopçarp(a, b-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
        int girdi1 = scan.nextInt();
        System.out.print("lütfen bir sayı daha giriniz : ");
        int girdi2 = scan.nextInt();
        int i, a, sonuc;
        sonuc = 0;
        a= 0;
        //3*4 yerine 3+3+3+3= 4+4+4
        for (i =0; i< girdi1; i++) {
            a +=girdi2;
            System.out.println(a);
        }
        System.out.println( girdi1 + " X " + girdi2 + " = " + a);
        System.out.println();

        i = 0;
        a = 0;
        while (i< girdi1){
            a += girdi2;
            i++;
            System.out.println(a);
        }
        System.out.println( girdi1 + " X " + girdi2 + " = " + a);
        System.out.println();

        i =0;
        a= 0;
        //3*5 yerine 3+3+3+3+3= 5+5+5
        if (girdi1>girdi2) {
            for (i = 0; i < girdi2; i++) {
                a += girdi1;
                System.out.println(a);
            }
            System.out.println(girdi1 + " X " + girdi2 + " = " + a);
            System.out.println();
        } else if (girdi1<girdi2) {
            for (i = 0; i < girdi1; i++) {
                a += girdi2;
                System.out.println(a);
            }
            System.out.println(girdi1 + " X " + girdi2 + " = " + a);
            System.out.println(sonuc);   System.out.println();
        }
       //3*5 yerine 3+3+3+3+3= 5+5+5
        a =0;
        int kucuk = girdi1;
        int buyuk = girdi2;

        if (girdi1>girdi2) {
            kucuk = girdi2;
            buyuk = girdi1;
        }
        for (i = 0; i < kucuk; i++) {
                a += buyuk;
                System.out.println(a);
            }
            System.out.println(girdi1 + " X " + girdi2 + " = " + a);
            System.out.println(a);
            System.out.println("*****");
            System.out.println(rectopçarp(girdi1,girdi2));












    }
}
