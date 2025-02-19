package ex6;

public class Q23 {
	
	
	static int max(int[] data) {
	
		if(data==null||data.length==0) { //null이 들어올때 length가 있으면 오류남
			return -999999;
		} 
		
		int maxVal = data[0];

		for(int i=1;i<data.length;i++) {
			if(maxVal<data[i]) {
				
				maxVal=data[i];
			}
		}
		return maxVal;	
	}
	
	
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		 System.out.println(java.util.Arrays.toString(data));
		 System.out.println("최대값:"+max(data));
		 System.out.println("최대값:"+max(null));
		 System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
	}

}
