package loop_problem;

public class sumfirstandlast{
	public static void main(String [] arg) {
		int num = 902459;
		int test = num;
		double digits = 0;
		while(num!=0) {
			digits += 1;
			num /=10;
		}
		int first_digit = test % 10;
		double last_digit = test / Math.pow(10,digits-1);
		int last = (int) last_digit;
		System.out.print(first_digit+last);
	}
	
}