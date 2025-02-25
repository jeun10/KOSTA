package ex7;

class Parent2 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2 {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}

public class Q20 {
	public static void main(String[] args) {
		Parent2 p = new Child2(); //상속, 오버라이딩, 업캐스팅
		Child2 c = new Child2();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}
