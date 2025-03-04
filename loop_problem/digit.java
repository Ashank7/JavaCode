package loop_problem;

public class digit{
	public static void main(String[] arg) {
		int num = 4325;
		while(num!=0) {
			System.out.println(num%10);
			num /=10;
		}
	}
}