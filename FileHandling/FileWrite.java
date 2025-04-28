import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
public static void main(String [] args) throws IOException{
  FileWriter f = new FileWriter("abc.txt",true);
  f.write("Hello World");
  f.write('\n');
  f.write("Doing File Handling in Java");
  f.flush();
  f.close();
  System.out.println("Done Writting");
  }
}
