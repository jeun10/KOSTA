package emp;

public class Sales extends Employee {
	
	int incentive;
	
	public Sales(String name, int pay) {
		super(name,pay);

	}
	
	public Sales(String name, int pay, int incentive) {
		super(name,pay);
		this.incentive=incentive;
	}
	
	@Override
	public String info() {
		return String.format("사번 : %s, 이름: %s, 급여: %d", num, name, getPay()+getIncentive());
	}
	
	
	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public static void main(String[] args) {
		
		Sales emp1=new Sales("홍길동",1000000,500000);
		Sales emp2=new Sales("김길동",2000000);
		Sales emp3=new Sales("하길동",3000000,100000);
		System.out.println(emp1.info());
		System.out.println(emp2.info());
		System.out.println(emp3.info());
			
	}
	
}
