package assignment;

class Bank{
	int AccountNo,Balance;
	void intialize(int acc,int b) {
		AccountNo = acc;
		Balance = b;
	}
	void withdrawl(int deduct) {
		if(Balance<deduct) {
			System.out.println("Not Enough Balance");
			return;
		}
		Balance = Balance - deduct;
		System.out.println("Remaning Account Balance is " + Balance);
	}
	void getbalance() {
		System.out.println("Account Balance is " + Balance);
	}
	public static void main(String[] args) {
		Bank b = new Bank();
		b.intialize(1, 1000);
		b.getbalance();
		b.withdrawl(1200);
		b.getbalance();
	}
}