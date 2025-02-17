import java.lang.reflect.Array;

public class DArrayTest2 {

	public static void main(String[] args) {
		int[][] darr1={
			{1,2,3,4},{5,6,7,8},{9,10,11,12}
		};
		
		int[][] darr2=new int[darr1.length+1][darr1[0].length+1];
		
		//값 복사
		for(int i=0;i<darr1.length;i++) {
			for(int j=0;j<darr1[i].length;j++) {
				darr2[i][j]=darr1[i][j];
				
				//가로
				darr2[i][darr2[0].length-1]+=darr2[i][j];
				
				//세로
				darr2[darr2.length-1][j]+=darr2[i][j];
			}
			//마지막칸 [3][4] 채우기
			if(i==darr1.length-1) {
				for(int j=0;j<darr2.length;j++) {
					darr2[darr2.length-1][darr2[0].length-1]+=darr2[i+1][j];
				}
			}
			
		}
		
		for(int i=0;i<darr2.length;i++) {
			for(int j=0;j<darr2[i].length;j++) {
				System.out.print(darr2[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
