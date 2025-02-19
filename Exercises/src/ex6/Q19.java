package ex6;

class Data {
	int x;
}

public class Q19 {
	public static void change(String str) {// call by reference
		str += "456";
	}

	public static void change(Data d) {
		d.x += 1000;
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);

		System.out.println("After change:" + str);

		System.out.println("-------------");
		Data d = new Data();
		d.x = 1;
		System.out.println(d.x);
		change(d);
		System.out.println("After change:" + d.x);

	}
}
