import java.util.Scanner;

public class Bank {
	Account[] accs = new Account[100];
	int cnt=0;
	Scanner sc = new Scanner(System.in);


	int selectMenu() {
		
		System.out.println("KOSTA 은행");
		System.out.println("1.계좌계설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계좌조회");
		System.out.println("5.전체계좌조회");
		System.out.println("6.계좌이체");
		System.out.println("0.종료");
		System.out.print("선택>>");
		
		int sel = Integer.parseInt(sc.nextLine());

		return sel;
	}

	void makeAccount() { //계좌 만들기

		System.out.println("[계좌개설]");

		
		System.out.print("계좌번호>>");
		String id = sc.nextLine();
		
		System.out.print("이름>>");
		String name = sc.nextLine();
	
		System.out.print("입금 금액(원)>>");
		int balance =Integer.parseInt(sc.nextLine());

		Account acc= new Account(id, name, balance);
		/*
		 * acc.id= id; acc.name=name; acc.balance=balance;
		 */
		
		accs[cnt]=acc;
		
		cnt++;
		
	}

	Account searchAccById(String id){//계좌 찾기
		int i=0;
		Account acc = null;
		for(i=0;i<cnt;i++) {
			if(accs[i].id.equals(id)) {
				acc=accs[i];
				break;
			}
		}
		return acc;
	}
	
	void deposit() { //입금
		System.out.println("[입금]");
		System.out.print("계좌번호 : ");
		String id=sc.nextLine();
		
		Account acc= new Account();
		acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		System.out.print("입금액:");
		int money=Integer.parseInt(sc.nextLine());
		
		acc.deposit(money);
		acc.info();
		
	}

	void withdraw() { //출금
		System.out.println("[출금]");
		System.out.print("계좌번호 : ");
		String id=sc.nextLine();
		
		Account acc= new Account();
		acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		System.out.print("출금액:");
		int money=Integer.parseInt(sc.nextLine());
		
		acc.withdraw(money);
		acc.info();
	}

	void accInfo() { //조회
		System.out.println("[계좌조회]");
		System.out.print("계좌번호 : ");
		String id=sc.nextLine();
		
		Account acc= new Account();
		acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}

		acc.info();
	}

	void allAccInfo() { //전체 계좌 조회
		System.out.println("[전체 계좌조회]");
		for(int i=0; i<cnt;i++) {
			System.out.println(accs[i].info());
		}
	}
	
	void transfer() { //이체
		System.out.println("[계좌 이체]");
		System.out.print("보내는 계좌번호 : ");
		String sid=sc.nextLine();
		System.out.print("이체 할 계좌번호 : ");
		String rid=sc.nextLine();
		
		Account sacc= new Account();
		sacc = searchAccById(sid);
		if(sacc==null) {
			System.out.println("보내는 계좌번호가 틀립니다.");
			return;
		}
		
		Account racc= new Account();
		racc = searchAccById(rid);
		if(racc==null) {
			System.out.println("받는 계좌번호가 틀립니다.");
			return;
		}
		
		System.out.print("이체 금액:");
		int money=Integer.parseInt(sc.nextLine());
		if(!sacc.withdraw(money)) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		racc.deposit(money);
		
		System.out.println(String.format("이체 후 남은 잔액 : %d", sacc.balance));
		
	
	}
	
	

	

}
