package ex6;

public class Q22 {
	/*
	 * 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다. 모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를
	 * 반환한다. 만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
	 */
	static boolean isNumber(String str) {
		char ch;
		boolean res = true;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(!(ch>='1'&&ch<'9')) {
				res = false;
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}
