
public class ArrayTest2 {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr1=new int[] {1,2,3,4,5};
		
		//int[] arr2= arr1; //얕은복사
		int[] arr2 = new int[arr1.length];
		
		//깊은복사1
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		//깊은복사2 많이 쓰임
		
		int[] arr3=new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		int[] arr4=new int[2];
		System.arraycopy(arr1, 1, arr3, 0, 2);
		
		//깊은복사3
		int[] arr5 = arr1.clone();
		arr2[0]=10;
		arr3[0]=20;
		arr5[0]=30;
		
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
		printArray(arr5);
		
		System.out.println("--------");
		
		
		//얕은복사
		
		int[] arr6 = arr1;
		arr6[0]=50;
		printArray(arr1);
		printArray(arr6);
		
		
	}
}
