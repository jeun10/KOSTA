package EX5;

public class Q10 {

	public static void main(String[] args) {
		/*
		 * 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다. (1)에 알맞은 코드를 넣어서 완성하시오.
		 */
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if(ch>='0'&&ch<='9') {
				result+=numCode[ch-'0'];
				
			}
			else if(ch>='a'&&ch<='z') {
				result+=abcCode[ch-'a'];
			}
			else {
				System.out.println("!입력범위 초과!");
				break;
			}
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}

}
