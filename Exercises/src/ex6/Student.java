package ex6;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	Student(){}
	
	Student(String name,int ban,int no, int kor,int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		//float avg = (int)((getTotal()/3F+0.05)*10) / 10F;
		float avg=getTotal()/3f;
		return Math.round(avg*10)/10f;
	}
	
	String info() {
		return String.format("%s, %d, %d, %d, %d, %d, %d, %.1f ",name,ban,no,kor, eng, math,getTotal(), getAverage());
	}
		
	
	
	
	
}
