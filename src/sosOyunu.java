import java.util.Scanner;


public class sosOyunu {
    public static boolean kontrol(char sos[][]) {
        boolean k = false;
        if (sos[0][0] == 'X' && sos[0][1] == 'X' && sos[0][2] == 'X') {
            System.out.println("birinci oyuncu kazandı");
            k = true;
        }
        if (sos[1][0] == 'X' && sos[1][1] == 'X' && sos[1][2] == 'X') {
            System.out.println("birinci oyuncu kazandı");
            k = true;
        }
        if (sos[2][0] == 'X' && sos[2][1] == 'X' && sos[2][2] == 'X') {
            System.out.println("birinci oyuncu kazandı");
            k = true;
        }
        if (sos[0][0] == 'X' && sos[1][0] == 'X' && sos[2][0] == 'X') {
            System.out.println("birinci oyuncu kazandı");
            k = true;
        }
        if (sos[0][1] == 'X' && sos[1][1] == 'X' && sos[2][1] == 'X') {
            System.out.println("birinci oyuncu kazandı");
            k = true;
        }
        if (sos[0][2] == 'X' && sos[1][2] == 'X' && sos[2][2] == 'X') {
            System.out.println("birinci oyuncu kazandı");
            k = true;
        }
        if (sos[0][0] == 'X' && sos[1][1] == 'X' && sos[2][2] == 'X') {
            System.out.println("birinci oyuncu kazandı");
            k = true;
        }
        if (sos[2][0] == 'X' && sos[1][1] == 'X' && sos[0][2] == 'X') {
            System.out.println("birinci oyuncu kazandı");
            k = true;
        }
        if (sos[0][0] == 'O' && sos[0][1] == 'O' && sos[0][2] == 'O') {
            System.out.println("ikinci oyuncu kazandı");
            k = true;
        }
        if (sos[1][0] == 'O' && sos[1][1] == 'O' && sos[1][2] == 'O') {
            System.out.println("ikinci oyuncu kazandı");
            k = true;
        }
        if (sos[2][0] == 'O' && sos[2][1] == 'O' && sos[2][2] == 'O') {
            System.out.println("ikinci oyuncu kazandı");
            k = true;
        }
        if (sos[0][0] == 'O' && sos[1][0] == 'O' && sos[2][0] == 'O') {
            System.out.println("ikinci oyuncu kazandı");
            k = true;
        }
        if (sos[0][1] == 'O' && sos[1][1] == 'O' && sos[2][1] == 'O') {
            System.out.println("ikinci oyuncu kazandı");
            k = true;
        }
        if (sos[0][2] == 'O' && sos[1][2] == 'O' && sos[2][2] == 'O') {
            System.out.println("ikinci oyuncu kazandı");
            k = true;
        }
        if (sos[0][0] == 'O' && sos[1][1] == 'O' && sos[2][2] == 'O') {
            System.out.println("ikinci oyuncu kazandı");
            k = true;
        }
        if (sos[2][0] == 'O' && sos[1][1] == 'O' && sos[0][2] == 'O') {
            System.out.println("ikinci oyuncu kazandı");
            k = true;
        }
        return k;
    }
    /*public static boolean cikis (char sos [][]){

        if ( sos[0][0]== 'X' && sos[0][1] == 'X'&& sos[0][2]== 'X')
        if ( sos[1][0]== 'X' && sos[1][1] == 'X'&& sos[1][2]== 'X')
        if ( sos[2][0]== 'X' && sos[2][1] == 'X'&& sos[2][2]== 'X')
        if ( sos[0][0]== 'X' && sos[1][0] == 'X'&& sos[2][0]== 'X')
        if ( sos[0][1]== 'X' && sos[1][1] == 'X'&& sos[2][1]== 'X')
        if ( sos[0][2]== 'X' && sos[1][2] == 'X'&& sos[2][2]== 'X')
        if ( sos[0][0]== 'X' && sos[1][1] == 'X'&& sos[2][2]== 'X')
        if ( sos[2][0]== 'X' && sos[1][1] == 'X'&& sos[0][2]== 'X')
        if ( sos[0][0]== 'O' && sos[0][1] == 'O'&& sos[0][2]== 'O')
        if ( sos[1][0]== 'O' && sos[1][1] == 'O'&& sos[1][2]== 'O')
        if ( sos[2][0]== 'O' && sos[2][1] == 'O'&& sos[2][2]== 'O')
        if ( sos[0][0]== 'O' && sos[1][0] == 'O'&& sos[2][0]== 'O')
        if ( sos[0][1]== 'O' && sos[1][1] == 'O'&& sos[2][1]== 'O')
        if ( sos[0][2]== 'O' && sos[1][2] == 'O'&& sos[2][2]== 'O')
        if ( sos[0][0]== 'O' && sos[1][1] == 'O'&& sos[2][2]== 'O')
        if ( sos[2][0]== 'O' && sos[1][1] == 'O'&& sos[0][2]== 'O')
    }

     */


    /*public static void sonuc (){
        char[][] o = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        if ( o[0][0]== 'S' && o[0][1] == 'O'&& o[0][2]== 'S')
            System.out.println("kazandınız");
        if ( o[1][0]== 'S' && o[1][1] == 'O'&& o[1][2]== 'S')
            System.out.println("kazandınız");
        if ( o[2][0]== 'S' && o[2][1] == 'O'&& o[2][2]== 'S')
            System.out.println("kazandınız");
        if ( o[0][0]== 'S' && o[1][0] == 'O'&& o[2][0]== 'S')
            System.out.println("kazandınız");
        if ( o[0][1]== 'S' && o[1][1] == 'O'&& o[2][1]== 'S')
            System.out.println("kazandınız");
        if ( o[0][2]== 'S' && o[1][2] == 'O'&& o[2][2]== 'S')
            System.out.println("kazandınız");
        if ( o[0][0]== 'S' && o[1][1] == 'O'&& o[2][2]== 'S')
            System.out.println("kazandınız");
        if ( o[2][0]== 'S' && o[1][1] == 'O'&& o[0][2]== 'S')
            System.out.println("kazandınız");
    }

     */
    /*public static char[][] sosO (int a){
        char[][] o = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        if (a ==1)
            o [0][0] = 'O';
        if (a ==2)
            o [0][1] = 'O';
        if (a ==3)
            o [0][2] = 'O';
        if (a ==4)
            o [1][0] = 'O';
        if (a ==5)
            o [1][1] = 'O';
        if (a ==6)
            o [1][2] = 'O';
        if (a ==7)
            o [2][0] = 'O';
        if (a ==8)
            o [2][1] = 'O';
        if (a ==9)
            o [2][2] = 'O';
        return o;
    }
     */
    /*public static char[][] sosS (int a){
        char[][] gir = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        if (a ==1)
            gir [0][0] = 'S';
        if (a ==2)
            gir [0][1] = 'S';
        if (a ==3)
            gir [0][2] = 'S';
        if (a ==4)
            gir [1][0] = 'S';
        if (a ==5)
            gir [1][1] = 'S';
        if (a ==6)
            gir [1][2] = 'S';
        if (a ==7)
            gir [2][0] = 'S';
        if (a ==8)
            gir [2][1] = 'S';
        if (a ==9)
            gir [2][2] = 'S';
        return gir;
    }
     */
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        // char[][] sos = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        int hamle1 = 0, hamle2 = 0;
        int secim;
        System.out.println("SOS oyununa hoş geldiniz.");

        while (true) {
            System.out.println("oynamak için 1'e, çıkmak için 2'ye basınız");
            secim = myScan.nextInt();
            if (secim > 2 || secim < 1) {
                System.out.println("yanlış seçim!!");
                continue;
            }
            if (secim == 2) {
                System.out.println("oyundan çıktınız. teşekkür ederiz");
                break;
            }
            if (secim == 1) {
                char[][] sos = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(sos[i][j] + " ");
                    }
                    System.out.println();
                }

                while (kontrol(sos) == false) {
                    int s;
                    int[] say = new int[10];
                    System.out.println("birinci oyuncu X oynasın");
                    hamle1 = myScan.nextInt();
                    for (int i = 0; i < 6; i++)
                        say[i] = hamle1;

                    while (hamle1 == hamle2) {
                        System.out.println("lütfen farklı bir hamle yapın");
                        hamle1 = myScan.nextInt();

                    }

                    if (hamle1 == 1)
                        sos[0][0] = 'X';
                    if (hamle1 == 2)
                        sos[0][1] = 'X';
                    if (hamle1 == 3)
                        sos[0][2] = 'X';
                    if (hamle1 == 4)
                        sos[1][0] = 'X';
                    if (hamle1 == 5)
                        sos[1][1] = 'X';
                    if (hamle1 == 6)
                        sos[1][2] = 'X';
                    if (hamle1 == 7)
                        sos[2][0] = 'X';
                    if (hamle1 == 8)
                        sos[2][1] = 'X';
                    if (hamle1 == 9)
                        sos[2][2] = 'X';
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(sos[i][j] + " ");
                        }
                        System.out.println();
                    }
                    if (kontrol(sos))
                        break;

                    System.out.println("ikinci oyuncu O oynasın.");
                    hamle2 = myScan.nextInt();
                    for (int j = 5; j < 10; j++)
                        say[j] = hamle2;
                    while (hamle2 == hamle1) {
                        System.out.println("lütfen farklı bir hamle yapın");
                        hamle2 = myScan.nextInt();
                    }
                    int min = say[0];
                    for (int m = 6; m < say.length; m++)
                        while (min == say[m]) {
                            System.out.println("lütfen oynanan sayıyı girmeyin");
                            hamle2 = myScan.nextInt();
                        }


                    if (hamle2 == 1)
                        sos[0][0] = 'O';
                    if (hamle2 == 2)
                        sos[0][1] = 'O';
                    if (hamle2 == 3)
                        sos[0][2] = 'O';
                    if (hamle2 == 4)
                        sos[1][0] = 'O';
                    if (hamle2 == 5)
                        sos[1][1] = 'O';
                    if (hamle2 == 6)
                        sos[1][2] = 'O';
                    if (hamle2 == 7)
                        sos[2][0] = 'O';
                    if (hamle2 == 8)
                        sos[2][1] = 'O';
                    if (hamle2 == 9)
                        sos[2][2] = 'O';

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(sos[i][j] + " ");
                        }
                        System.out.println();
                    }
                    if (kontrol(sos))
                        break;
                }
            }
        }
        System.out.println("***");


    }
}
