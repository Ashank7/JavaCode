package assignment;
import java.util.Scanner;
class Time{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String in format hh:mm:ss :-  ");
		String ans = sc.next();
		String start = ans.substring(0,2);
		String middle = ans.substring(3,5);
		String end = ans.substring(6,8);
		int startint,middleint,endint;
		startint = Integer.parseInt(start);
		middleint = Integer.parseInt(middle);
		endint = Integer.parseInt(end);
		System.out.print(startint*60 * 60 + middleint * 60 + endint + " seconds");
//		sc.close();
	}
}