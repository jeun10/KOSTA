package ex7;

abstract class Robot {
	abstract void action();
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}

	@Override
	void action() {
		// TODO Auto-generated method stub
		dance();
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}

	@Override
	void action() {
		// TODO Auto-generated method stub
		 sing();
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}

	@Override
	void action() {
		// TODO Auto-generated method stub
		draw();
	}
}

public class Q18 {

	public static void action(Robot r) {
		r.action();

//		if (r instanceof DanceRobot) {
//			((DanceRobot) r).dance();
//		} 
//		else if (r instanceof SingRobot) {
//			((SingRobot) r).sing();
//		} 
//		else if (r instanceof DrawRobot) {
//			((DrawRobot) r).draw();
//
//		}
	}

	public static void main(String[] args) {

		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	} // main
}
