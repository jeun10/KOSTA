class Data{
	int x;
	
}
public class ClassTest5 {

	static void increment(int value) {
		value++;
	}
	
	static void increment(Data d) {
		d.x++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d= new Data();
		d.x=1000;
		increment(d.x);
		System.out.println(d.x);
		
		increment(d);
		System.out.println(d.x);
	}

}
