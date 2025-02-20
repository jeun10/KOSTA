import emp.Employee;

public class Company {

	Employee[] emps = new Employee[100];
	int cnt = 0;

	void enter(Employee emp) {
		emps[cnt] = emp;
		cnt++;
	}

	Employee findEmp(String num) {
		
		for (int i = 0; i < cnt; i++) {
			if (emps[i].getNum().equals(num)) {
				return emps[i];
			}
		}
		return null;
	}

	void setPay(String num, int pay) {
//		Employee emp = new Employee();
//		emp = findEmp(num);

		Employee emp = findEmp(num);

		if (emp == null) {
			System.out.println("틀린 사번");
			return;
		}
		emp.setPay(pay);

	}

	void bonus(String num, int pay) {

		Employee emp = findEmp(num);
		if (emp == null) {
			System.out.println("틀린 사번");
			return;
		}
		emp.setBonus(pay);

	}

	void allEmpInfo() {

		for (int i = 0; i < cnt; i++) {
			System.out.println(emps[i].info());
		}
	}

	public static void main(String[] args) {

		Company com = new Company();

		/*
		 * com.enter(new Employee("1001", "홍길동", 100000)); com.enter(new
		 * Employee("1002", "김길동", 200000)); com.enter(new Employee("1003", "고길동",
		 * 300000));
		 */
		com.enter(new Employee("홍길동", 100000));
		com.enter(new Employee("김길동", 200000));
		com.enter(new Employee("고길동", 300000));
		com.allEmpInfo();
		System.out.println();

		//com.setPay("1001", 1000000);
		//com.bonus("1002", 500000);

		com.allEmpInfo();

	}
}
