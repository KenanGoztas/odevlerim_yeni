import java.util.Scanner;

public class arrays {
    public static int[] toplam() {
        int[] arr1 = {3, 4, 6, 8};
        int[] arr2 = {5, 7, 9, 2};
        int[] arr3 = new int[4];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
        return arr3;

    }

    public static void dizienkucuk(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (min > a[i])
                min = a[i];
        System.out.println(min);
    }

    public static void dizisirala() {
        int[] diz = {5, 4, 6, 7, 3, 1, 2};
        int gecici;
        for (int i = 0; i < diz.length; i++) {
            for (int j = i + 1; j < diz.length; j++) {
                if (diz[i] > diz[j]) {
                    gecici = diz[i];
                    diz[i] = diz[j];
                    diz[j] = gecici;
                }
            }
        }
        for (int i = 0; i < diz.length; i++)
            System.out.print(diz[i]);

    }

    public static void foreachdizi() {
        int[] arr1 = {3, 4, 6, 8};
        for (int a : arr1) {
            System.out.print(a + " - ");
        }
        for (int b : toplam()) {
            System.out.print(b + " - ");
        }
        System.out.println("****");
    }

    public static void dizicoklu() {

        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arr[0][1]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void dizicoklutopla() {

        int a[][] = {{1, 2, 3}, {4, 5, 6}};
        int b[][] = {{3, 2, 1}, {6, 5, 4}};

        int c[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void asal(int as) {
        int[] asal = new int[as];
        int b = 0;
        for (int i = 2; i < as; i++) {
            int sayac = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    sayac++;
            }
            if (sayac == 0)
                asal[b++] = i;
        }
        for (int i = 0; i < asal.length; i++)
            if (asal[i] != 0)
                System.out.print(asal[i] + " - ");
    }

    public static void bölen(int bol) { //verilen sayının bölenlerini bulmak
        int[] arrböl = new int[bol / 2]; //girilen sayıya göre dizinin büyüklüğünü belirlemeliyiz??
        int a = 0;
        for (int i = 2; i <= bol / 2; i++) { //dizilere bölenleri ekledim. 1 eklemedim.
            if (bol % i == 0) {
                arrböl[a++] = i;
            }
        }
        //burada bölenleri yazdırdım
        for (int i = 0; i < arrböl.length; i++) //süslü paranteze gerek var mı?
            if (arrböl[i] != 0) //boş dizileri yazdırmadım
                System.out.print(arrböl[i] + " - ");

        if (arrböl[0] == 0) //eğer hiç bölen olmazsa, ilk dizenin içi boş kalır yani 0
            System.out.println("girilen sayı asaldır.");
    }

    public static void fibonac(int f) {
        int[] fib = new int[f];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
        for (int i = 0; i < fib.length; i++)
            System.out.print(fib[i] + " - ");
    }

    public static void palindrom(String str) {
        char[] kelime = new char[str.length()];
        char[] yeni = new char[str.length()];
        int sayac = 0;
        // kelimenin harflerini diziye aldım
        for (int i = 0; i < str.length(); i++) {
            kelime[i] = str.charAt(i);
            // System.out.print(kelime[i]);
        }
        //aynı kelimenin haflerini tersten diziye aldım
        for (int i = 0; i < str.length(); i++) {
            yeni[i] = str.charAt(str.length() - i - 1);
            //System.out.print(yeni[i]);
        }
        //iki dizinin eşit olup olmadığını kontrol ettim.
        for (int i = 0; i < str.length(); i++)
            if (kelime[i] == yeni[i])
                sayac += 1;
        if (sayac == str.length())
            System.out.println(str + " kelimesi palindromdur");
        else
            System.out.println(str + " kelimesi palindrom değildir");
    }

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int[] arrt = toplam();
        for (int i = 0; i < arrt.length; i++)
            System.out.print(arrt[i] + " - ");
        System.out.println("****");
        dizienkucuk(toplam());
        System.out.println("***");
        foreachdizi();
        dizicoklu();
        System.out.println("****");
        dizicoklutopla();
        System.out.println("***");
        System.out.println("girdiğiniz sayıya kadar olan asal sayıları bulalım");
        asal(myScan.nextInt());
        System.out.println("***");
        System.out.println("hangi sayının bölenlerini bulmak istersiniz");
        bölen(myScan.nextInt());
        System.out.println("****");
        System.out.println(" fibonacci sayısının kaçıncı basamagını bulmak istersiniz");
        fibonac(myScan.nextInt());
        System.out.println("***");
        //String s = myScan.next();
        System.out.println("bir kelime giriniz");
        palindrom(myScan.next()); //nextLine metodu çalışmıyor, neden??
        dizisirala();
        System.out.println();


    }
}
