
public class Account {
	String id;
	String name;
	int balance;

	Account() {
	}

	Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	String info() {
		return String.format("계좌번호:%s, 이름:%s, 잔액:%d", id, name, balance);
	}

	boolean deposit(int money) {
		if (money <= 0)
			return false;
		balance += money;
		return true;
	}

	boolean withdraw(int money) {
		if (money <= 0)
			return false;
		balance -= money;
		return true;

	}

}
