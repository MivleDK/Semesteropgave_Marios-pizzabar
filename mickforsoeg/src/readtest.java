import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readtest {

    protected String PizzaNo;

    public String readMenu(int i) throws IOException {
        BufferedReader objReader = null;
        String strCurrentLine;
        objReader = new BufferedReader(new FileReader("C:\\Users\\mla\\Google Drev\\Datamatiker\\1_semester\\Semesteropgave_Marios pizzabar\\menu2.txt"));

        ArrayList<String> menukortArr = new ArrayList<>();

        while ((strCurrentLine = objReader.readLine()) != null){
            menukortArr.add(strCurrentLine);
        }
        return menukortArr.get(i);
    }
}