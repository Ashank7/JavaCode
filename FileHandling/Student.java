import java.io.File;
import java.io.IOException;
public class Student{

 public static void main(String[] args) throws IOException {
   File f = new File("abc.txt");
   f.createNewFile();
   boolean flag = f.exists();
   if(!flag){
      System.out.println("File Doesn't Exits");
    }
 }
}
