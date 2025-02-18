
public class StaticTest2 {
	int x;
	static int y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; //로컬지역변수
		int t=100;
		method(t);
		
		
		System.out.println("-------------");
		StaticTest2 st2=new StaticTest2();
		st2.x=100;
		st2.method2();
		y=200;
		
	
	}
	void method2() {
		System.out.println(x);
		System.out.println(y);
	}
	
	static void method(int t) {
		int n;
		n=10;
		
	}

}
