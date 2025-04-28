import java.util.Scanner;

class Stock {
  String name;
  int id,quantity,price;

  Stock(int id,String name,int quantity,int price){
     this.id = id;
     this.name = name;
     this.quantity = quantity;
     this.price = price;
  }

  void Display(){
    if(this.id != 0){
    System.out.println("------------------------------------------------");
    System.out.println("\nId of the Product is " +  this.id);
    System.out.println("\nName of the Product is " + this.name);
    System.out.println("\nQuanity of the Product is "+ this.quantity);
    System.out.println("\nPrice of the Product is " + this.price);
    }
  }
  void UpdateItem (int id,String name,int quantity,int price) {
     if(this.id == id){
     this.name = name;
     this.quantity = quantity;
     this.price = price;
     }
  }

  void RemoveItem (int id) {
    if(this.id == id){
      this.id = 0;
      this.name = null;
      this.price = 0;
      this.quantity = 0;
    }
  }
}

public class Inventory_Management_System {

 public static void main(String [] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("\n Welcome To Inventory Management System\n");

    System.out.println("\n1 For Adding Products in Stock\n2 For Quitting the Inventory Management System\n");

    int choice = sc.nextInt();

    if(choice == 1) {

    System.out.print("\nEnter the Number of Types of Products You Want in Stock :- ");

    int num = sc.nextInt();
  
    Stock []arr = new Stock[num];

    for (int i = 0; i < num; i++) {

      sc.nextLine();
      
      System.out.print("\nEnter the Name of Product " + (i+1) + " :- ");

      String name = sc.nextLine();

      System.out.print("\nEnter the Quantity of Product " + (i+1) + " :- ");

      int quantity = sc.nextInt();

      System.out.print("\nEnter the Price of Product " + (i+1) + " :- ");

      int price = sc.nextInt();

      arr[i] = new Stock(i+1,name,quantity,price);
    }

      while (true){
         System.out.println("\n1 For Displaying All Products\n2 For Updating a Product\n3 For Removing a Product\n4 For Exit\n");
         int newchoice = sc.nextInt();

         if(newchoice == 1){
          for (Stock stock:arr){
           stock.Display(); 
          }
         }

        else if (newchoice == 2) {

        System.out.print("\n Enter the Id of Product " + " :- ");

        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("\nEnter the New Name of Product " + " :- ");

        String name = sc.nextLine();

        System.out.print("\nEnter the New Quantity of Product " + " :- ");

        int quantity = sc.nextInt();

        System.out.print("\nEnter the New Price of Product " + " :- ");

        int price = sc.nextInt();
            
        for (Stock stock:arr){
            stock.UpdateItem(id, name, quantity, price);
          }
        }
        else if (newchoice == 3){
        System.out.print("\n Enter the Id of Product " + " :- ");

        int id = sc.nextInt();

        for (Stock stock:arr){
            stock.RemoveItem(id);
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
