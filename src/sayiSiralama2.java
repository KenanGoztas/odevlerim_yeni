import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class sayiSiralama2 {


    public static void main(String[] args) {
        ArrayList<Integer> sira = disaridanVeriAlma.getNumbers();
        for(Integer sayi : sira){
            System.out.println(sayi);
        }
        //text dosyasının icerisinde sırala, file handing,
        /*
        Scanner myscan = new Scanner(System.in);
        System.out.println("kaç tane sayı gireceksiniz");
        int a = myscan.nextInt();
        int[] sira = new int[a];


        for (int i = 0; i < sira; i++) {
            sira[i] = myscan.nextInt();
        }

        for (int sayi : sira) {
            System.out.print(sayi + "  ");
        }
         */
        /*
        System.out.println();
        System.out.print("girilen sayılar büyükten küçüğe : ");
        Integer gecici = new Integer();
        for (int i = 0; i < sira.size(); i++) {
            for (int j = i + 1; j < sira.size(); j++) {
                if (sira.get(i)> sira.get(j)) {
                    gecici = sira.get(i);
                   // sira.get(i) = sira.get(j);
                   // sira.get(j) = gecici;
                }
            }
        }
        for (int i = 0; i < sira.size(); i++)
            if (i < sira.size() - 1)
                System.out.print(sira.get(i) + " - ");
            else
                System.out.println(sira.get(i));
        System.out.println();
        System.out.print("girilen sayılar büyükten küçüğe :");
        for (int i = 0; i < sira.size(); i++) {
            for (int j = i + 1; j < sira.size(); j++) {
                if (sira[i] < sira[j]) {
                    gecici = sira[i];
                    sira[i] = sira[j];
                    sira[j] = gecici;
                }
            }
        }
        for (int i = 0; i < sira.length; i++)
            if (i < sira.length - 1)
                System.out.print(sira[i] + " - ");
            else
                System.out.println(sira[i]);

         */

    }
}






