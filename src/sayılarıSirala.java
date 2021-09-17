import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class sayılarıSirala {
    public static String fileReading(){
        String fileData = null;
        try {
            Scanner scn = new Scanner(System.in);
            String input = scn.next();
            scn.close();
            File file = new File(input);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                fileData = reader.nextLine();
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("Please entry correct path.");
        }
        return fileData;
    }
    public static void main(String[] args) {
        //text dosyasının icerisinde sırala, file handing,
        Scanner myscan = new Scanner(System.in);
        System.out.println("kaç tane sayı gireceksiniz");
        int a = myscan.nextInt();
        int[] sira = new int[a];
        for (int i = 0; i < sira.length; i++) {
            sira[i] = myscan.nextInt();
        }
        for (int sayi : sira) {
            System.out.print(sayi + "  ");
        }
        System.out.println();
        System.out.print("girilen sayılar büyükten küçüğe : ");
        int gecici;
        for (int i = 0; i < sira.length; i++) {
            for (int j = i + 1; j < sira.length; j++) {
                if (sira[i] > sira[j]) {
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
        System.out.println();
        System.out.print("girilen sayılar büyükten küçüğe :");
        for (int i = 0; i < sira.length; i++) {
            for (int j = i + 1; j < sira.length; j++) {
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

    }
}
