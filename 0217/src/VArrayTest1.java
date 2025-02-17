
public class VArrayTest1 {

	public static void main(String[] args) {
		
		
		int[][] varr1=new int[3][];
		System.out.println(varr1.length);
		//System.out.println(varr1[0].length);
		
		varr1[0] = new int[4];
		varr1[1] = new int[2];
		varr1[2] = new int[3];
		System.out.println(varr1[0].length);
		System.out.println(varr1[1].length);
		System.out.println(varr1[2].length);
		System.out.println("-----------");
		int[][] darr1=new int[3][4];
		System.out.println(darr1.length);
		System.out.println(darr1[0].length);
		System.out.println(darr1[1].length);
		System.out.println(darr1[2].length);
		
		
	}

}
