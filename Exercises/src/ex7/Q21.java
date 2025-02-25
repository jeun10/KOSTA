package ex7;

interface Movable {
	void move(int x, int y);
}



public class Q21 {
	static void attack(Movable f) {
		
	}
	
	public static void main(String[] args) {
		
		attack(null);
		
		Movable m = new Movable() {
			public void move(int x, int y) {
				// TODO Auto-generated method stub

			}
		};
		//한번만 사용할 익명클래스 자체가 업캐스팅
		
		attack(m);
		
	}
}
