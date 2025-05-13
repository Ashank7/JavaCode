import java.util.Scanner;

public class Pallindrome {
  void ReverseString(String input){
    int length = input.length();
    int start = 0;
    int end = length-1;
    int flag = 1;
    while(start <= end){
      if(input.charAt(start) != input.charAt(end)){
         flag = 0;
         break;
      }
      start++;
      end--;
    }
    if(flag == 1){
      System.out.println("String is Pallindrome");
    }
    else {
      System.out.println("String is not a Pallindrome");
    }


  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String :- ");
    String input = sc.next();
    Pallindrome r1 = new Pallindrome();
    r1.ReverseString(input); 
    sc.close();
  }

}
