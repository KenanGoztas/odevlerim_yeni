import java.util.Scanner;

public class fibonacci {
    public static int recfib (int a){
        if (a ==0 || a ==1)
            return 1;
        else
        return  recfib(a-1)+ recfib(a -2);
    }
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("fibonacci için adım sayısını giriniz");
        int girdi = myScan.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print(a + " - " + b );
        for (int i = 0; i < girdi - 2; i++) {
           c =  a + b;
           a = b;
           b = c;

           System.out.print( " - " + c );
        }
        System.out.println("*******");



        int i = 0;
        a = 0;
        b = 1;
        c = 0;
        System.out.print(a + " - " + b );

        while (girdi-2 >i) {
            c =  a +b;
            a = b;
            b = c;
            i++;
            System.out.print( " - " + c );
        }
        System.out.println("AAA");
        System.out.println(recfib(girdi));
        System.out.println("BBB");







    }
}
