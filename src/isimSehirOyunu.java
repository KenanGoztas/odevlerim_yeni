import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class isimSehirOyunu {
    //try catch hatası var!!
    public static String sehir() {
        Random ran = new Random();
        int r = ran.nextInt(82);
        // System.out.println(r);
        String sehir[] = {"ADANA", "ADIYAMAN", "AFYONKARAHiSAR", "AGRI", "AKSARAY",
                "AMASYA", "ANKARA", "ANTALYA", "ARDAHAN", "ARTViN", "AYDIN", "BALIKESiR",
                "BARTIN", "BATMAN", "BAYBURT", "BiLECiK", "BiNGöL", "BiTLiS", "BOLU", "BURDUR",
                "BURSA", "çANAKKALE", "çANKIRI", "çORUM", "DENiZLi °", "DüZCE", "DiYARBAKIR",
                "EDiRNE", "ELAZIğ", "ERZiNCAN", "ERZURUM", "ESKişEHiR", "GAZiANTEP", "GiRESUN",
                "GüMüşHANE", "HAKKARi", "HATAY", "ıgDIR", "ISPARTA", "içEL", "iSTANBUL", "iZMiR",
                "KAHRAMANMARAş", "KARABüK", "KARAMAN", "KARS", "KASTAMONU", "KAYSERi", "KiliS",
                "KIRIKKALE", "KIRKLARELi", "KIrşehiR", "KOCAELi", "KONYA", "KüTAHYA", "MALATYA",
                "MANiSA", "MARDiN", "MUğLA", "Muş", "Nevşehir", " Niğde", "ORDU", "OSMANiYE", "RiZE",
                "SAKARYA", "SAMSUN", "SiiRT", "SiNOP", "SiVAS", "ŞANLIURFA", "ŞIRNAK", "TEKiRDağ",
                "TOKAT", "TRABZON", "TUNCELi", "UşAK", "VAN", "YALOVA ", "YOZGAT", "ZONGULDAK"};
        return sehir[r];
    }
    public static void main(String[] args) {
        System.out.println("Şehir bulma oyununa hoşgeldiniz!");
        String kelime = sehir().toUpperCase(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        String bilinmeyen = "*********************";
        int sayac = 10;
        int secim = 0;
        while (true) {
            System.out.println();
            System.out.println("bir işlem seçiniz.");
            System.out.println("1. şehir bulma oynamak istiyorum");
            System.out.println("2. Çıkış");
            try {
                Scanner myScan = new Scanner(System.in); //neden yeniden Scanner object tanımlamak zorunda kaldım??
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


