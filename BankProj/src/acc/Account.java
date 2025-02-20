package acc;

public class Account {
	String id;
	String name;
	int balance;
	
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account() {
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	@Override
	public String toString() { //tostring obj프로젝트가 만들어놓은 info같은 친구
		return String.format("계좌번호:%s, 이름:%s, 잔액:%d", id, name, balance);
	}

	public boolean deposit(int money) {
		if (money <= 0)	return false;
		balance += money;
		return true;
	}

	public boolean withdraw(int money) {
		if (balance < money) return false;
		balance -= money;
		return true;

	}
	

}
