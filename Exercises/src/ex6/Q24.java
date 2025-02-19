package ex6;

public class Q24 {
	
	
	static int abs(int val) {
		
		
		return(val<0? -val:val);
		
	}
	
	
	public static void main(String[] args) {
		 int value = 5;
		 System.out.println(value+"의 절대값:"+abs(value));
		 value = -10;
		 System.out.println(value+"의 절대값:"+abs(value));
	}

}
