package emp;

public class PartTime extends Employee {
	int time,payPerTime;
	public PartTime() {}
	public PartTime(String id, String name, int time, int payPerTime) {
//		this.id = id;
//		this.name= name;
		super(id, name);
		this.time= time;
		this.payPerTime = payPerTime;
	}
	
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPayPerTime() {
		return payPerTime;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	
	@Override
	public int getPay() {
		return getTime()*getPayPerTime();
	}
//	public String toString() {
//		return super.toString() + String.format("급여 : %d", getPay());
//	}
	
}
