import java.util.Scanner;
class Student4{
   String name,branch;
   int rollnumber;
   Student4(String name,String branch,int rollnumber){
      this.name = name;
      this.branch = branch;
      this.rollnumber = rollnumber;
   }
   void Getter(int rollnumber){
       if (this.rollnumber == rollnumber){
          System.out.println("Name of Student is "+name);
          System.out.println("Branch of Student is "+branch);
          System.out.println("RollNumber of Student is "+branch);
        }
    }
  }

public class exp4{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     Student4 []arr = new Student4[3];
     for(int i=0;i<3;i++){
     System.out.println("Enter Name " + (i+1) + ":");
     String name = sc.nextLine();
     System.out.println("Enter Branch " + (i+1) + ":");
     String branch = sc.nextLine();
     System.out.println("Enter Roll Number " + (i+1) + ":");
     int rollnumber = sc.nextInt();
     sc.nextLine(); 
     arr[i] = new Student4(name, branch, rollnumber);
    }
     System.out.println("Enter Roll Number to get student details:");
     int rollnumberToSearch = sc.nextInt();
     boolean found = false;
     for (Student4 student : arr) {
            if (student != null) {
                student.Getter(rollnumberToSearch);
                found = true;
            }
        }
       if(!found){
         System.out.println("No Student Found with this roll number");
       }
       sc.close();
     }
}
