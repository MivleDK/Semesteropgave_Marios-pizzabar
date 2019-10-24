import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readtest {

    public static void main(String[] args) throws IOException {
        BufferedReader objReader = null;

        String strCurrentLine;

        objReader = new BufferedReader(new FileReader("C:\\Users\\mla\\Google Drev\\Datamatiker\\1_semester\\Semesteropgave_Marios pizzabar\\menu2.txt"));

        ArrayList<String> menukortArr = new ArrayList<>();

        while ((strCurrentLine = objReader.readLine()) != null){
            menukortArr.add(strCurrentLine);
        }
        System.out.println(menukortArr);
        System.out.println(menukortArr.get(12));
    }
}