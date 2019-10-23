import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class pizza {

    public static void main(String[] args) throws FileNotFoundException {

        //Indlæs menukort filen
        File menukort = new File("./src/menukort.txt");

        //init ArrayList som indeholder data fra menukort filen
        ArrayList<String> menukortArr = new ArrayList<>();

        //Læs filen og populer array "menukortArr"
        try (Scanner sc = new Scanner(menukort)) {
            while (sc.hasNext()) {
                menukortArr.add(sc.nextLine());
            }
        }

        //Print menukort
        System.out.println(menukortArr);

    }
}


