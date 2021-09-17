import java.util.Scanner;

public class sosOyunu2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char[][] myArray = new char[3][3];
        init(myArray);

        while (check(myArray)) {
            print(myArray);
            System.out.println(" Lütfen position giriniz: ");
            int intRow = myScanner.nextInt();
            int intColum = myScanner.nextInt();

            while (setInput(myArray, 'X', intColum, intRow) == false) {
                System.out.println("lütfen dogru bir sayi giriniz ....");
                intRow = myScanner.nextInt();
                intColum = myScanner.nextInt();
            }

            print(myArray);
            System.out.println(" Lütfen position giriniz: ");
            intRow = myScanner.nextInt();
            intColum = myScanner.nextInt();

            while (setInput(myArray, 'O', intColum, intRow) == false) {
                System.out.println("lütfen dogru bir sayi giriniz ....");
                intRow = myScanner.nextInt();
                intColum = myScanner.nextInt();
            }
        }

    }

    public static void print(char[][] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            for (int j = 0; j < pArray[0].length; j++) {
                System.out.print(" " + pArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void init(char[][] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            for (int j = 0; j < pArray[0].length; j++) {
                pArray[i][j] = '_';
            }
        }
    }

    public static boolean check(char[][] sos) {
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

    public static boolean setInput(char[][] pArray, char pChar, int pColum, int pRow) {
        if (pArray[pRow][pColum] == '_') {
            pArray[pRow][pColum] = pChar;
            return true;
        }
        return false;
    }


}
