
public class DArrayTest1 {
	public static void main(String[] args) {
		
		int[][] darr1=new int[3][4];
		//System.out.println(darr1.length);
		//System.out.println(darr1[0].length);
		int[][] darr2=new int[][] {
			{1,2,3,4},{5,6,7,8},{9,10,11,12}
		};
		int[][] darr3=new int[][] {
			{1,2,3,4},{5,6,7,8},{9,10,11,12}
		};
		
		int sum=0;
		
		for(int i=0;i<darr2.length;i++) {
			for(int j=0;j<darr2[i].length;j++) {
				sum+=darr2[i][j];
			}
		}
		
		System.out.println("darr2 요소의 총합 : "+ sum);
		
		
	}

}
