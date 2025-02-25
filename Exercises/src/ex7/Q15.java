package ex7;

class Unit {
}

class AirUnit extends Unit {
}

class GroundUnit extends Unit {
}

class Tank extends GroundUnit {
}

class AirCraft extends AirUnit {
}

public class Q15 {
	public static void main(String[] args) {
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		 u = (Unit)ac; //업캐스팅 () 생략 가능
		 u = ac;
		 
		 GroundUnit gu = (GroundUnit)u; //다운 캐스팅
		 
		 Unit u2 = new Unit();
		 GroundUnit gu2 = (GroundUnit)u; // 다운캐스팅 잘못된 예시
		 
		 
		 AirUnit au = ac; //업캐스팅
		 t = (Tank)u; //다운캐스팅 잘못된 예시
		 
		 GroundUnit gu3 = t; //업캐스팅 가능
	}
}
