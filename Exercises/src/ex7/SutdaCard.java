package ex7;

class SutdaCard {
	final int num;
	final boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for(int i=0;i<CARD_NUM/2;i++) {
			
			
			
			if(i+1==1||i+1==3||i+1==8) {
				cards[i] = new SutdaCard(i+1, true);
				
			}
			else {
				cards[i] = new SutdaCard(i+1, false);
			}
			cards[i+10] = new SutdaCard(i+1, false);

		}
	}
	
	
	public void shuffle() {
		int idx1 = (int)(Math.random()*20);
		int idx2 = (int)(Math.random()*20);
		SutdaCard tmp = cards[idx1];
		cards[idx1]=cards[idx2];
		cards[idx2]=tmp;
		
		
		
		
	}
	
	public SutdaCard pick() {
		int idx= (int)(Math.random()*20);
		return cards[idx];
	}
	
	public SutdaCard pick(int idx) {
		return cards[idx];
	}
	
	
	
}
