class Person {//class 정의
	// 데이터 타입이 됨 -> 사용자 정의 타입
	int age;
	String name;
	
}

public class ClassTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.age=18;
		p.name="길동";
		
		Person p2=new Person();
		p2.age=20;
		p2.name="고길동";
		

	}

}
