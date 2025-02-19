package ex6;

class MyPoint {

	int x;
	int y;

	MyPoint() {
	}

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int dx, int dy) {

		// double dist=Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		return Math.sqrt((dx - x) * (dx - x) + (dy - y) * (dy - y));
	}

	double getDistance(MyPoint p) {
		// TODO Auto-generated method stub
		return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
	}

}

public class Q7 {
	/*
	 * 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서 드로 정의하시오.
	 */

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		// p(1,1)과 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
		MyPoint p2=new MyPoint(2,2);
		System.out.println(p.getDistance(p2));
		
	}

}
