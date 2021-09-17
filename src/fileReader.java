import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class fileReader {
    static Scanner input;
    public static void main(String[] args)  {
        File file = new File("/Users/zeynep/Desktop/test/cities.txt");
        try  {
            input = new Scanner(file);
        }catch (Exception e){
            System.out.println("dosya bulunamadı");
        }
        while (input.hasNext()){
            String a = input.next();
            ArrayList<String> myList = new ArrayList<>();
            myList.addAll(Collections.singleton(input.next()));
            Random r = new Random();

            myList.get(1);
            //String str = myList.get();
            //System.out.println(str);
            for (String i: myList)
            System.out.println(i);
        }






    }
}
