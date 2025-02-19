package ex6;

public class Q6 {
	/*
	 * 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
	 */
	static double getDistance(int x, int y, int x1, int y1) {
		
		//double dist=Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
	}

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}

}
