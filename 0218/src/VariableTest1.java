class Variable{
	int iv;
	static int sv;
	void method() {
		int lv=0;
		System.out.println(lv);
	}
	
}
public class VariableTest1 {
	public static void main(String[] args) {

	
		Variable.sv=10;
		Variable v1= new Variable();
		Variable v2= new Variable();
		v1.iv=20;//클래스 변수는 참조 변수로도 접근 가능. 하지만 클래스 변수로 접근 권장
		System.out.println(v1.sv);
		System.out.println(v2.sv);
		
		
		v1.method();
	
	
	}
}
