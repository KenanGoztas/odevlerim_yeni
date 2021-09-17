import java.util.Scanner;

public class palindromik {
    public static boolean recPal (String s) { //stackoverflowdan aldım
        if(s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
            return recPal(s.substring(1, s.length()-1));

        // if its not the case than string is not.
        return false;
    }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Kelime giriniz: ");
            String kelime = scan.nextLine();
            String yenikelime = "";
            for(int i = (kelime.length()-1); i >= 0; i--)  {
                yenikelime += kelime.charAt(i);
            }
            if(yenikelime.equals(kelime)) {
                System.out.println("Girilen kelime Palindrom bir kelimedir.");
            }
            else {
                System.out.println("Girdiginiz kelime Palindrom bir kelime degildir.");
            }



            String inputSting, reverseString = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Kelime giriniz");
            inputSting = in.nextLine();

            int length = inputSting.length();

            for ( int i = 0 ; i <= length-1 ; i++ ){
                reverseString += inputSting.charAt(length-1-i); //Stringin tüm char'larını tersten alıp yeni stringe ekliyoruz..
            }

            if(inputSting.equals(reverseString)){
                System.out.println("Palindromik Kelime");
            }else{
                System.out.println("Palindromik Kelime değil");
            }
            System.out.println("***");
            System.out.println(recPal(scan.nextLine()));

            //System.out.println(inputSting.equals(reverseString) ? "Palindromik Kelime": "Palindromik Kelime Değil"); //Tek satır if


        }
}
