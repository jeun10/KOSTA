package emp;

public class Employee {
	
	final static int YEAR=2015;
	static int empNum=1;
	
	String num;
	String name;
	int pay;
	
	public Employee(){}
	
	public Employee(String name, int pay) {
		num=""+YEAR+empNum++;		
		this.name=name;
		this.pay=pay;
	}
	public Employee(String num, String name, int pay){
		this.num = num;
		this.name = name;
		this.pay = pay;
	}

	
	public String info() {
		
		return String.format("사번 : %s, 이름: %s, 급여: %d", num, name, pay);
		
	}
	public int getPay() {
		return pay;
	}
	
	public void setPay(int pay) {
		this.pay=pay;
	}
	
	
	public void setBonus(int money) {
		this.pay+=money;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
}
