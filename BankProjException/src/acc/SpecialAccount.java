package acc;

import exc.BankException;

public class SpecialAccount extends Account {

	String grade;

	public SpecialAccount() {
	}

	public SpecialAccount(String id, String name, int balance, String grade) {
//		this.id = id;
//		this.name = name;
//		this.balance=balance;
		super(id, name, balance);
		this.grade = grade;

	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public boolean deposit(int money) throws BankException {
		int inmoney = money;

		switch (grade.toUpperCase()) {
		case "VIP":
			inmoney += ((int) (inmoney * 1.04));
			break;
		case "GOLD":
			inmoney += ((int) (inmoney * 1.03));
			break;
		case "SLIVER":
			inmoney += ((int) (inmoney * 1.02));
			break;
		case "NORMAL":
			inmoney += ((int) (inmoney * 1.01));
			break;
		}

		return super.deposit(inmoney);
	}

	@Override
	public String toString() {
		// return String.format("계좌번호:%s, 이름:%s, 잔액:%d, 등급:%s ", id, name,
		// balance,grade);
		return super.toString() + ",등급: " + getGrade();
	}

	public static void main(String[] args) {

		SpecialAccount sacc1 = new SpecialAccount("10001", "홍길동", 100000, "VIP");
		SpecialAccount sacc2 = new SpecialAccount("10002", "김길동", 200000, "Gold");
		SpecialAccount sacc3 = new SpecialAccount("10003", "나길동", 300000, "Silver");
		SpecialAccount sacc4 = new SpecialAccount("10004", "박길동", 400000, "Normal");

		System.out.println(sacc1.toString());
		System.out.println(sacc2.toString());
		System.out.println(sacc3.toString());
		System.out.println(sacc4.toString());
	}
}
