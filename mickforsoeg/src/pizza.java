import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pizza {

    public static void main(String[] args) throws FileNotFoundException {

        //Indlæs menukort filen
        File menukort = new File("C:\\Users\\mla\\Google Drev\\Datamatiker\\1_semester\\Semesteropgave_Marios pizzabar\\menu2.txt");

        //init ArrayList som indeholder data fra menukort filen
        ArrayList<String> menukortArr = new ArrayList<>();

        //Læs filen og populer array "menukortArr"
        try (Scanner sc = new Scanner(menukort)) {
            while (sc.hasNext()) {
                menukortArr.add(sc.nextLine());
            }
            sc.close();
        }

        //Print menukort
        System.out.println(menukortArr);
    }
}


