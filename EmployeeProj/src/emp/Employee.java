package emp;

public class Employee {
	String id, name;

	public Employee() {
	}

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return 0;
	}

	public String toString() {
		return String.format("사번: %s, 이름: %s 급여: %d", getId(), getName(),getPay());
	}

}
