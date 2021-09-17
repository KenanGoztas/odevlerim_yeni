import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.LinkPermission;
import java.util.*;

public class isimSehir2 {
    public static String sehir() {
        Random rand = new Random();
        Scanner myScan = null;
        int r = rand.nextInt(82);
        ArrayList<String> arr = new ArrayList<>();
        String [] str = new String[82];
        int i = 0;
        try {
            File dosya = new File("/Users/zeynep/Desktop/test/cities.txt");
            myScan = new Scanner(dosya);
            while (myScan.hasNextLine()){
                String s = myScan.next();
                arr.add(s);
                str[i++] = s;
               /* String s = myScan.next();

                arr.addAll(Collections.singleton(s));

                for (String a : str)
                    System.out.println(a);
                 */

            }
           // System.out.println(str[0]);


           /*arr.addAll((Collection<? extends String>) dosya);
            while (input.hasNextLine()) {
                arr.addAll(input.nextInt());
            }

            */
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        myScan.close();

        return arr.get(r);
    }

    public static void main(String[] args) {
      //  System.out.println(sehir());

        System.out.println("Şehir bulma oyununa hoşgeldiniz!");
        String kelime = sehir().toUpperCase(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        String bilinmeyen = "*********************";
        int sayac = 10;
        int secim;
        while (true) {
            System.out.println();
            System.out.println("bir işlem seçiniz.");
            System.out.println("1. şehir bulma oynamak istiyorum");
            System.out.println("2. Çıkış");
            try {
                Scanner myScan = new Scanner(System.in); //neden yeniden Scanner object tanımlamak zorunda kaldım??
                secim = myScan.nextInt();
            } catch (InputMismatchException a){
                System.out.println("lütfen rakam giriniz!!!");
                continue;
            }
            if (secim == 2)
                break;
            if (secim > 2 || secim < 1) {
                System.out.println("yanlış seçim!!");
                continue;
            }
            System.out.println("Dikkat 10 hakkınız var!!");
            System.out.println(kelime.length() + " harfli bir ilimiz..");
            while (sayac > 0 && bilinmeyen.contains("*")) {
                System.out.println("Bir Harf Giriniz");
                System.out.println(bilinmeyen);
                String tahmin = input.next().toUpperCase(Locale.ROOT);
                if (tahmin.equals(kelime)) {
                    System.out.println("Tebrikler, bildiniz : " + kelime);
                    sayac = 10;
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
                        sayac--;
                        System.out.println(sayac + " hakkınız kaldı");
                    } else {
                        bilinmeyen = geciciBilinmeyen;
                    }
                    if (kelime.equals(bilinmeyen)) {
                        System.out.println("tebrikler bildiniz : " + kelime);
                        //sayac = 10;
                    }
                }
            }
            if (sayac < 1)
                System.out.println("Üzgünüm, kaybettiniz. Cevap : " + kelime);
        }


    }
}


