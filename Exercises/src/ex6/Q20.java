package ex6;

public class Q20 {

	static int[] shuffle(int[] arr) {

		int[] copyArr = new int[arr.length];
		System.arraycopy(arr, 0, copyArr, 0, 0);

		int temp = 0;
		for (int i = 0; i < 8; i++) {
			int m = (int) (Math.random() * 9);
			int n = (int) (Math.random() * 9);

			temp = copyArr[m];
			copyArr[m] = copyArr[n];
			copyArr[n] = temp;
		}
		return copyArr;
	}

	public static void main(String[] args) {

		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println("after shuffle");
		System.out.println(java.util.Arrays.toString(original));
		System.out.println(java.util.Arrays.toString(result));

	}

}
