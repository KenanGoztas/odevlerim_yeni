import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class getCities {

    public static String getText() {
        ArrayList<String> myCities = new ArrayList<>();
        String temp = "";
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        File file = new File("/Users/zeynep/Desktop/test/cities.txt");
        Scanner reader = null;
        try {
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                temp = reader.next();
                String[] strList = temp.split(" "); //burayı anlamadım
                myCities.addAll(Arrays.asList(strList));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found. Please try again!");
        }
        Random r = new Random();
        int ran = r.nextInt(82);
        return myCities.get(ran);
    }

    public static void main(String[] args) {
        System.out.println("Şehir bulma oyununa hoşgeldiniz!");
        String kelime = getText().toUpperCase(Locale.ROOT);
        Scanner myScan = new Scanner(System.in);
        String bilinmeyen = "*********************";
        int sayac = 10;
        int secim = 0;
        while (true) {
            System.out.println();
            System.out.println("bir işlem seçiniz.");
            System.out.println("1. şehir bulma oynamak istiyorum");
            System.out.println("2. Çıkış");
            try {
                Scanner myScan2 = new Scanner(System.in); //neden yeniden Scanner object tanımlamak zorunda kaldım??
                secim = myScan.nextInt();
            } catch (InputMismatchException a){
                System.out.println("lütfen rakam giriniz");
                continue;
            }

            if (secim == 2) {
                break;
            }
            if (secim > 2 || secim < 1) {
                System.out.println("yanlış seçim!!");
                continue;
            }
            System.out.println("Dikkat 10 hakkınız var!!");
            System.out.println(kelime.length() + " harfli bir ilimiz..");
            while (sayac > 0 && bilinmeyen.contains("*")) {
                System.out.println("Bir Harf Giriniz");
                System.out.println(bilinmeyen);
                String tahmin = myScan.next().toUpperCase(Locale.ROOT);
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