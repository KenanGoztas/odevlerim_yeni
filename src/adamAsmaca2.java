import java.util.Random;
import java.util.Scanner;

public class adamAsmaca2 {
    public static void main(String[] args) {
        // Random ran = new Random();

        String kelime = "kenan";
        String bilinmeyen = "*****";
        int sayac = 1;
        Scanner input = new Scanner(System.in);
        while (sayac < 6 && bilinmeyen.contains("*")) {
            System.out.println("Tahmininizi yazınız");
            System.out.println(bilinmeyen);
            String tahmin = input.next();
            if (tahmin.equals(kelime)) {
                System.out.println("Tebrikler, bildiniz : " + kelime);
                sayac = 8;
                bilinmeyen = kelime;
            } else {
                String geciciBilinmeyen = "";
                for (int i = 0; i < kelime.length(); i++) {
                    if (kelime.charAt(i) == tahmin.charAt(0)) {
                        geciciBilinmeyen += tahmin.charAt(0);
                    } else if (bilinmeyen.charAt(i) != '*') {
                        geciciBilinmeyen += kelime.charAt(i);
                    } else {
                        geciciBilinmeyen += "*";
                    }
                }
                if (bilinmeyen.equals(geciciBilinmeyen)) {
                    sayac++;
                } else {
                    bilinmeyen = geciciBilinmeyen;
                }
                if (kelime.equals(bilinmeyen)) {
                    System.out.println("tebrikler bildiniz : " + kelime);
                }
            }


        }


    }
}
