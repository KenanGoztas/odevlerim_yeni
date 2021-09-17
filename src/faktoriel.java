import java.util.Scanner;

public class faktoriel {
    public static int faktor  (int sayi) {
        int b =1;
        int i = 1;
        while (i<=sayi) {
            b*=i;
            i++;
        }
        System.out.print(sayi + "! = " );
       return b;
    }
    public static int recfak (int sayi) {
        if (sayi ==0)
            return 1;
        return sayi* recfak( sayi -1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
        int girdi = scan.nextInt();
        int b =1;
        int i = 1;
        for (i = 1; i <= girdi; i++) {
            b*=i;
            //System.out.println(b);
        }
        System.out.println( girdi + "! = " + b);
        System.out.println("/////");



        b =1;
        i = 1;
        while (i<=girdi) {
            b*=i;
            i++;
        }
        System.out.println(girdi + "! = " + b );

        System.out.println("***");

        int ab = faktor(girdi);
       System.out.println(ab);

        System.out.println("??????");
        System.out.println(recfak(girdi));
        System.out.println("+++++");

        System.out.println(metod_return_parametreli.faktoriyel(girdi));








    }
}
