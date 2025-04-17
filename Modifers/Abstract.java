package modifers;

abstract class Loan{
	abstract double getLoanAmount();
	abstract String getLoanType();
}
class HomeLoan extends Loan{
	double getLoanAmount() {
		return 0;
	}
	String getLoanType() {
		return "Home Loan";
	}
}
class Abstract{
	public static void main(String []args) {
		HomeLoan h1 = new HomeLoan();
		System.out.println(h1.getLoanType());
	}
}