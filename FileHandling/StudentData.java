import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentData {
 public static void main(String[] args) throws IOException {
  FileWriter f = new FileWriter("student.txt",true);

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter the Number of Students you want :- ");

  int num = sc.nextInt();

  for(int i=0;i<num;i++){

  System.out.print("Enter the Name of Student " + (i+1) + " :- ");

  String name = sc.next();

  System.out.print("Enter the Course of Student " + (i+1) + " :- ");

  String course = sc.next();

  System.out.print("Enter the City of Student " + (i+1) + " :- ");

  String city = sc.next();

  System.out.print("Enter the RollNumber of Student " + (i+1) + " :- ");

  String rollnumber = sc.next();

  f.write(name);
  f.write("\n");
  f.write(course);
  f.write("\n");
  f.write(city);
  f.write("\n");  
  f.write(rollnumber);
  f.write("\n");
  f.flush();
  }
    sc.close();
    f.close();
 }
}
