import emp.Employee;
import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class Company {
	Employee[] emps=new Employee[100];
	int cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company();
		com.addEmployee(new Permanent("101","홍길동",1800000));
		com.addEmployee(new Sales("102","홍길동",1000000,500000));
		com.addEmployee(new PartTime("103","하길동",160,10000));
		com.allEmployeeInfo();
		System.out.println("전직원 총 급여액"+com.getAllTotalPay());
		
	}


	private int getAllTotalPay() {
		int total=0;
		for(int i=0; i<cnt;i++) {
			total += emps[i].getPay();
		}
		return total;
	}


	private void allEmployeeInfo() {
		for(int i=0;i<cnt;i++) {
			System.out.println(emps[i]);
		}
		
	}

	private void addEmployee(Employee emp) {
		emps[cnt++] =emp;
	}

}
