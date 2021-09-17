import java.util.Scanner;

public class sayılarınToplami {
    public static int recsaytop (int a){
        if (a == 0)
            return 0;
        else
        return a -1 + recsaytop(a - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int i;
        int b = 0;
        int girdi = scan.nextInt();
        for (i = 0; i<girdi; i++) {
            b+=i;
           System.out.println(b);
        }
        System.out.println("sıfırdan " + girdi + "'a kadar olan sayıların toplamı = " + b);

        System.out.println(" ");

        b = 0;
        i =0;
        while (i <girdi) {
            b+=i;
            System.out.println(b);
            i++;
        }
        System.out.println("sıfırdan " + girdi + "'a kadar olan sayıların toplamı = " + b);

        System.out.println(top(girdi));
        System.out.println("*****");
        System.out.println(recsaytop(girdi));





    }
    public static int top (int a)
    {
       int b = 0;
        int i =0;
        while (i <a) {
            b+=i;
            System.out.println(b);
            i++;
        }
        System.out.println("sıfırdan " + a + "'a kadar olan sayıların toplamı = " + b);
        return b;





    }
}
