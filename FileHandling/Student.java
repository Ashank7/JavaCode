import java.io.File;
import java.io.IOException;
public class Student{

 public static void main(String[] args) throws IOException {
   File f = new File("abc.txt");
   File ff = new File("/home/ashank/eclipse-workspace","firstjava");
   f.createNewFile();
   boolean flag = f.exists();
   if(!flag){
      System.out.println("File Doesn't Exits");
    }
    String [] str = ff.list();
    for (String s: str) {
     File fff = new File(ff,s);
     String [] str1= fff.list();
     for (String ss: str1){
        System.out.println(ss); 
      }
     System.out.println(s);
    }
    for (String s:str){

    }
 }
}
