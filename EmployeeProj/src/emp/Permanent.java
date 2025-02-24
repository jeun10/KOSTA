package emp;

public class Permanent extends Employee {
	int salary;
	
	public Permanent(){}
	public Permanent(String id, String name, int salary){
//		this.id=id;
//		this.name = name;
		super(id, name);
		this.salary = salary;
		
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public int getPay() {
		return getSalary();
	}
	
//	public String toString() {
//		return super.toString() + String.format("급여 : %d", salary);
//	}
	
}
