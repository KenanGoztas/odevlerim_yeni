import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class disaridanVeriAlma {
    public static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> myList = new ArrayList<>();
        String temp = "";
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        reader.close();
        try {
            File file = new File(input);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                temp = scan.nextLine();
                String[] strList = temp.split(" ");
                for (String myInts : strList) {
                    myList.add(Integer.valueOf(myInts));
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return myList;


    }

}
