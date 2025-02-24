package emp;

public class Sales extends Permanent {
	
	int incentive;
	public Sales(){}
	public Sales(String id, String name, int salary, int incentive){
//		this.id =id;
//		this.name=name;
//		this.salary = salary;
		super(id, name,salary);
		this.incentive = incentive;
	}
	public int getIncentive() {
		return incentive;
	}
	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return super.getPay()+getIncentive();
	}
//	public String toString() {
//		return getPay());
// 
//	}
}
