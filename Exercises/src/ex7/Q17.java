package ex7;

abstract class Unit2 {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
	}
}

class Marine extends Unit2 { // 보병

	void stimPack() {
		/* 스팀팩을 사용한다. */}

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub

	}
}

class Tank1 extends Unit2 { // 탱크

	void changeMode() {
		/* 공격모드를 변환한다. */}

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub

	}
}

class Dropship extends Unit2 { // 수송선
	void load() {
		/* 선택된 대상을 태운다. */ }

	void unload() {
		/* 선택된 대상을 내린다. */ }

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub

	}
}

public class Q17 {

}
