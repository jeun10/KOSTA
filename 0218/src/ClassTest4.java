class Account{
	String id;
	String name;
	int balance;
	
	void deposit(int money) {
		balance=balance+money;
	}
	void withdraw(int money) {
		balance=balance-money;
	}
	void info() {
		System.out.println(String.format("계좌번호 : %s, 이름: %s, 잔액: %d", id,name,balance));
	}
	
}
public class ClassTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1= new Account();
		
		acc1.id="10001";
		acc1.name="홍길동";
		acc1.balance=100000;
		
		acc1.info();
		acc1.deposit(10000);
		acc1.info();
		acc1.withdraw(5000);
		acc1.info();

		
		
	}

}
