class Tv {

	String color; // 색깔
	boolean power; // 젂원상태(on/off)
	int channel; // 채널

	void power() {
		power = !power;
	} // 젂원on/off

	void channelUp() {
		channel++;
	};

	// 채널 높이기
	void channelDown() {
		channel--;
	}
	
	void state() {
		System.out.println(String.format("power:%s channel: %d", power?"on":"off",channel));
		
	}
}

public class ClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv();
		
		tv.power();
		tv.channel = 11;
		tv.channelUp();
		//tv.channelDown();
		//System.out.println(String.format("power:%s channel: %d", tv.power?"on":"off",tv.channel));
		//tv.channelDown();
		tv.state();
		
		
		//Tv tv2 = tv; //tv의 주소를 tv2에 넣어줌
		Tv tv2=new Tv();
		tv2=tv;
		
		tv2.state();
		
		tv2.channelDown();
		tv2.state();
		tv.state();
	}

}
