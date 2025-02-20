import emp.Permanent;

public class Company {
	Employee[] emps=new Employee[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company();
		com.addEmployee(new Permanent("101","홍길동",1800000));
		com.addEmployee(new Sales("102","홍길동",1000000,500000));
		com.addEmployee(new PartTime("103","하길동",160,50000));
		com.allEmployeeInfo();
		System.out.println("전직원 총 급여액"+com.getAllTotalPay());
		
	}

}
