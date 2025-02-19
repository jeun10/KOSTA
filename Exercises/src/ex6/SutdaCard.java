package ex6;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		/*
		 * this.num=1; this.isKwang=true;
		 */
		
		this(1,true);
	}
	
	SutdaCard(int num,boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		//return String.format("%d%s", num, isKwang==true?"K":"");
		
		return num + (isKwang==true?"K":"");
	}
	
}
