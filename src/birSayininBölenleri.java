import java.util.Scanner;

public class birSayininBölenleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int girdi = scan.nextInt();
        int i;
        //ilk denemede başardım
        for (i = 1; i <= girdi / 2; i++) {

            if (girdi % i == 0) {
                System.out.print(i + " - ");
            }
        }
        System.out.println(girdi);

        System.out.print(girdi + " sayısının bölenleri =  ");
        for (i = 1; i <= girdi / 2; i++) {
            if (girdi % i == 0) {
                System.out.print(i + " - ");
            }
        }
        System.out.println(girdi);

       /* i=1;
        while (i<girdi){
            if (girdi%i ==0){
                System.out.println(i);
            }
            i++;

        }

        */
        System.out.println(metod_return_parametreli.birSayininBolenleri(girdi));


    }
}
