import java.io.IOException;
import java.io.FileReader;
import java.lang.StringBuilder;

public class ReadFile {
  public static void main(String [] args) throws IOException {
   FileReader file = new FileReader("abc.txt");

   // Reading File Fully
   // int i;
   // while ((i = file.read()) != -1){
   //      System.out.print((char) i);
   //  }
   //  file.close();

    // Reading File Line by Line
    int i;
    StringBuilder line = new StringBuilder();
    while ((i = file.read()) != -1){
          char c = (char) i;
          if(c == '\n'){
             System.out.println(line.toString());
             line.setLength(0);
          }
          else {
            line.append(c);
          }
    }
    if (line.length() > 0 ) {
        System.out.println(line.toString());
    }
    file.close();
 }
}
