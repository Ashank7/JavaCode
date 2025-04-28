import java.util.Scanner;

class Employee {
  String name,department;
  int id,salary,price;

  Employee(int id,String name,int salary,String department){
     this.id = id;
     this.name = name;
     this.salary = salary;
     this.department = department;
  }

  void Display(){
    if(this.id != 0){
    System.out.println("------------------------------------------------");
    System.out.println("\nId of the Employee is " +  this.id);
    System.out.println("\nName of the Employee is " + this.name);
    System.out.println("\nSalary of the Employee is "+ this.salary);
    System.out.println("\nDepartment of the Employee is " + this.department);
    }
  }
  void UpdateEmployee (int id,String name,int salary,String department) {
     if(this.id == id){
     this.name = name;
     this.salary = salary;
     this.department = department;
     }
  }

  void RemoveEmployee (int id) {
    if(this.id == id){
      this.id = 0;
      this.name = null;
      this.salary = 0;
      this.department = null;
    }
  }
}

public class Employee_Record_System {

 public static void main(String [] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("\n Welcome To Employee Record System\n");

    System.out.println("\n1 For Adding Employees in System\n2 For Quitting the Employee Record System\n");

    int choice = sc.nextInt();

    if(choice == 1) {

    System.out.print("\nEnter the Number of Employee You Want in System :- ");

    int num = sc.nextInt();
  
    sc.nextLine();

    Employee []arr = new Employee[num];

    for (int i = 0; i < num; i++) {
      
      System.out.print("\nEnter the Name of Employee " + (i+1) + " :- ");

      String name = sc.nextLine();

      System.out.print("\nEnter the Salary of Employee " + (i+1) + " :- ");

      int salary = sc.nextInt();

      sc.nextLine();

      System.out.print("\nEnter the Department of Employee " + (i+1) + " :- ");

      String department = sc.nextLine();

      arr[i] = new Employee(i+1,name,salary,department);
    }

      while (true){
         System.out.println("\n1 For Displaying All Employees\n2 For Updating a Employee\n3 For Removing a Employee\n4 For Exit\n");
         int newchoice = sc.nextInt();

         if(newchoice == 1){
          for (Employee employee:arr){
           employee.Display(); 
          }
         }

        else if (newchoice == 2) {

        System.out.print("\n Enter the Id of Employee " + " :- ");

        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("\nEnter the New Name of Employee " + " :- ");

        String name = sc.nextLine();

        System.out.print("\nEnter the New Salary of Employee " + " :- ");

        int salary = sc.nextInt();

        sc.nextLine();

        System.out.print("\nEnter the New Department of Employee " + " :- ");

        String department = sc.nextLine();
            
        for (Employee employee:arr){
            employee.UpdateEmployee(id, name, salary, department);
          }
        }
        else if (newchoice == 3){
        System.out.print("\n Enter the Id of Product " + " :- ");

        int id = sc.nextInt();

        for (Employee stock:arr){
            stock.RemoveEmployee(id);
          }
        }
        else if(newchoice == 4){
            break;
        }
        else {
           System.out.println("Invalid Choice Entered");
        }

        }
      }
    sc.close();
   }
 }
