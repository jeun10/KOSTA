class Calculator1 {

	static int add(int x, int y) {
		return x + y;
	}
	static int sub(int x, int y) {
		return x-y;
	}
	static int mul(int x, int y) {
		return x*y;
	}
	static int div(int x, int y) {
		return y==0? 0: x/y;
	}
	//공통 변수가 없이 늘 대상을 파라미터로 받기때문에 new하지 않아도 됨.
}
class Calculator2{
	int x,y;
	int add() {return x+y;}
	int sub() {return x-y;}
	int mul() {return  x*y;}
	int div() {return y==0? 0: x/y;}
}
public class ClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator1 calc1= new Calculator1();
		System.out.println(calc1.add(1, 5)); 
		System.out.println(calc1.sub(20, 5)); 
		System.out.println(calc1.mul(20, 5)); 
		System.out.println(calc1.div(20, 5)); 
		
		Calculator2 calc2=new Calculator2();
		calc2.x=20;
		calc2.y=10;
		System.out.println(calc2.add());
		System.out.println(calc2.sub());
		System.out.println(calc2.mul());
		System.out.println(calc2.div());

	}

}
