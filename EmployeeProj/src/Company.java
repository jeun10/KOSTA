import emp.Employee;
import emp.IBusinessTrip;
import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class Company {
	Employee[] emps = new Employee[100];
	int cnt;

	public int getAllTotalPay() {
		int total = 0;
		for (int i = 0; i < cnt; i++) {
			total += emps[i].getPay();
		}
		return total;
	}

	public void allEmployeeInfo() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(emps[i]);
		}

	}

	public void addEmployee(Employee emp) {
		emps[cnt++] = emp;
	}
	
	public void regBusinessTrip(IBusinessTrip emp, int day) {
		//영업직과 계약직만 출장 등록 가능
		//영업직은 하루당 20만원 급여에 포함
		//계약직은 시간당 만원 하루 24만원 급여에 포함
		emp.goBusinessTrip(day);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company();
		
		Permanent per1=new Permanent("101", "홍길동", 1800000);
		Sales sal1 = new Sales("102", "홍길동", 1000000, 500000);
		PartTime pt1 = new PartTime("103", "하길동", 160, 10000);
		
		com.addEmployee(per1);
		com.addEmployee(sal1);
		com.addEmployee(pt1);
		
		//com.regBusinessTrip(per1,2);
		com.regBusinessTrip(sal1,1);
		com.regBusinessTrip(pt1,1);

		com.allEmployeeInfo();
		System.out.println("전직원 총 급여액" + com.getAllTotalPay());

	}

}
