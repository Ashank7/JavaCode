import java.io.IOException;
import java.io.FileReader;
public class ReadFile {
  public static void main(String [] args) throws IOException {
   FileReader file = new FileReader("abc.txt");
   int i;
   while ((i = file.read()) != -1){
        System.out.print((char) i);
    }
    file.close();
 }
}
