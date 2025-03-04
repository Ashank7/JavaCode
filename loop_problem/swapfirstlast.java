package loop_problem;



public class swapfirstlast{
	public static void main(String [] arg) {
		int num = 43451;
		int copy = num;
		int length = 0;
		while(num!=0) {
			length += 1;
			num /=10;
		}
		System.out.print(copy + length);
	}
}