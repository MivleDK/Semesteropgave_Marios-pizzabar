import java.io.FileWriter;
import BufferedWriter;

public class skrivtilfil{

public static void main(String[] args) {
    skriv("A");

}

public static void skriv(String s){
    try{
        File f = new File("minFil");
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        bw.flush();

    }catch{
        IOException ex){}
    }
}
}