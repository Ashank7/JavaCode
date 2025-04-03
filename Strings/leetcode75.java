import java.util.Scanner;

public class leetcode75 {
  String reverseVowels(String s) {
    char [] strarr = s.toCharArray();
    int length = s.length();
    int left = 0, right = length-1;
    String vowels = "aeiouAEIOU";
    while(left < right) {
	if(vowels.indexOf(strarr[left]) == -1){left++ ;}
	else if(vowels.indexOf(strarr[right]) == -1){right-- ;}
	else{
	  char temp = strarr[left];
	  strarr[left] = strarr[right];
	  strarr[right] = temp;  
	  left++;
          right--;
	}
    }
   return new String(strarr);
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String :- ");
    String s1 = sc.nextLine();
    leetcode75 obj = new leetcode75();
    String ans = obj.reverseVowels(s1);
    System.out.println(ans);
  }
}
