class Test{
	int iv;
	static int sv;
	
	void method() {
		//instance method에서는 static변수, instance변수 모두 사용가능
		//또한 static method, instance method 모두 호출 가능
		iv=10;
		sv=100;
		method2();
	}
	
	void method2() {}
	
	static void smethod2() {
		//static 메서드는 instance 변수, instance 메서드 사용 불가
		
		//iv=20; //인스턴스 변수 오류
		sv=200;
		//method2(); //인스턴스 메소드 오류
		smethod2();
		
	}
	
}


public class StaticTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static 변수 메서드 클래스명 붙여 호출
		Test.sv = 5;
		Test.smethod2();
		
		//인스턴스 변수나 메서드는 객체 새애성 후 참조변수를 통해 접근
		Test t= new Test();
		t.iv=7;
		t.method();
		
	}

}
