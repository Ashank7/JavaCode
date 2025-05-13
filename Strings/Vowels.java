import java.util.Scanner;

public class Vowels {
  int CountVowels(String input){
    int length = input.length();
    int count = 0;
    for(int i=0 ;i < length ; i++){
      char c = input.charAt(i);
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
         count += 1;
      } 
    }
    return count;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String :- ");
    String input = sc.next();
    Vowels v = new Vowels();
    int count = v.CountVowels(input);
    System.out.println("Number of Vowels Present in the String is : " + count);
    sc.close();
    
  }
}
