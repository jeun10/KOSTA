package EX5;


public class Q8 {

	public static void main(String[] args) {
		/*
		 * 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’ 을 찍어서 그래프를 그리는 프로그램이다.
		 */
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		for (int i = 0; i < answer.length; i++) {
			counter[answer[i]-1]+=1;
		}
		for (int i = 0; i < counter.length; i++) {
			int cnt=0;
			if(counter[i]!=0) {
				System.out.print(counter[i]);
				for(int j=0;j<counter[i];j++) {
					System.out.print("*");
					
				}
			}
			
			/*
			 * (2) 알맞은 코드를 넣어 완성하시오.
			 */
			System.out.println();
		}
	}

}
