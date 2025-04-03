import java.util.Scanner;

public class Solution {
  String mergeAtlernately(String word1, String word2) {
    StringBuffer res = new StringBuffer("");
    int size1 = word1.length();
    int size2 = word2.length();
    int loop = 0;
    if(size1 > size2 ) {loop = size2 ;}
    else {loop = size1 ;}
    for(int i=0;i<loop;i++){
	res.append(word1.charAt(i));
	res.append(word2.charAt(i));	
    }
  public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    String word1 = s1.nextLine();
    String word2 = s1.nextLine();
    Solution s4 = new Solution();
    String ans = s4.mergeAtlernately(word1, word2);
    System.out.println(ans);
  }
}
