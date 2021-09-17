import java.util.Scanner;

public class teklerintoplami {
    public static int rectektop (int tek) {
        if (tek <2)
            return 1;
        else if (tek %2 ==1)
            return tek + rectektop(tek -2);
        else
        return rectektop(tek-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
        int girdi = scan.nextInt();
        int i, a;
        a = 0;
        for (i= 0; i< girdi; i++){
            if (i%2==1){
                a+=i;
            }
            System.out.println(a);
        } System.out.println("sıfırdan " + girdi + "'a kadar olan  tek sayıların toplamı = " + a);
        System.out.println();
        while (i<girdi) {
            if (i%2==1){
                a+=i;
            } i++;
            System.out.println(a);
        } System.out.println("sıfırdan " + girdi + "'a kadar olan  tek sayıların toplamı = " + a);
        System.out.println("*****");
        System.out.println(rectektop(girdi));








    }
}
