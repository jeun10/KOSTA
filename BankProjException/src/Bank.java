import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import exc.BankException;
import exc.ERR_CODE;

public class Bank {
	Account[] accs = new Account[100];
	int cnt=0;
	Scanner sc = new Scanner(System.in);


	int selectMenu() throws BankException{
		
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
		if(!(sel>=0 && sel<=6)) throw new BankException("메뉴오류", ERR_CODE.MENU_ERR);
		return sel;
	}
	
	void selMakeAccount() throws BankException {
		System.out.println("[계좌계설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		if(sel==1) makeAccount();
		else if(sel==2) makeSpecialAccount();
		else throw new BankException("메뉴오류", ERR_CODE.MENU_ERR);
	}

	void makeAccount() throws BankException{ //일반계좌 만들기

		System.out.println("[일반 계좌개설]");

		 
		System.out.print("계좌번호>>");
		String id = sc.nextLine();
		
		Account checkAcc=searchAccById(id);
		
		if(checkAcc != null) {
			throw new BankException("계좌번호가 중복됩니다", ERR_CODE.DOUBLEID_ERR);
		}
		
		System.out.print("이름>>");
		String name = sc.nextLine();
	
		System.out.print("입금 금액(원)>>");
		int balance =Integer.parseInt(sc.nextLine());
		if(balance<0) {
			throw new BankException("입금액을 확인하세요", ERR_CODE.DEPOSIT_ERR);
		}
		Account acc= new Account(id, name, balance);
		/*
		 * acc.id= id; acc.name=name; acc.balance=balance;
		 */
		
		accs[cnt]=acc;
		
		cnt++;
		
	}
	
	void makeSpecialAccount() throws BankException{ //특수 계좌 만들기

		System.out.println("[특수계좌개설]");

		
		System.out.print("계좌번호>>");
		String id = sc.nextLine();
		Account checkAcc=searchAccById(id);
		
		if(checkAcc != null) {
			throw new BankException("계좌번호가 중복됩니다", ERR_CODE.DOUBLEID_ERR);
		}
		System.out.print("이름>>");
		String name = sc.nextLine();
	
		System.out.print("입금 금액(원)>>");
		int balance =Integer.parseInt(sc.nextLine());
		if(balance<0) {
			throw new BankException("입금액을 확인하세요", ERR_CODE.DEPOSIT_ERR);
		}
		
		System.out.print("등급(VIP,Gold,Silver,Normal)");
		String grade = sc.nextLine();
		

		Account acc= new SpecialAccount(id, name, balance,grade);
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
			if(accs[i].getId().equals(id)) {
				acc=accs[i];
				break;
			}
		}
		return acc;
	}
	
	void deposit() throws BankException { //입금
		System.out.println("[입금]");
		System.out.print("계좌번호 : ");
		String id=sc.nextLine();
		
			Account acc= new Account();
			acc = searchAccById(id);
			if(acc==null) {
				//System.out.println("계좌번호가 틀립니다.");
				//return;
				throw new BankException("계좌번호가 틀립니다", ERR_CODE.ACCID_ERR);
			}
			
			System.out.print("입금액:");
			int money=Integer.parseInt(sc.nextLine());
			if(money<0) {
				throw new BankException("입금액을 확인하세요", ERR_CODE.DEPOSIT_ERR);
			}
			acc.deposit(money);
			acc.toString();
			
		
	}

	void withdraw() throws BankException { //출금
		System.out.println("[출금]");
		System.out.print("계좌번호 : ");
		String id=sc.nextLine();
		
		Account acc= new Account();
		acc = searchAccById(id);
		if(acc==null) {
			//System.out.println("계좌번호가 틀립니다.");
			//return;
			throw new BankException("계좌번호가 틀립니다", ERR_CODE.ACCID_ERR);

		}
		
		System.out.print("출금액:");
		int money=Integer.parseInt(sc.nextLine());
		if(money<0) {
			throw new BankException("출금액을 확인하세요", ERR_CODE.DEPOSIT_ERR);
		}
		acc.withdraw(money);
		System.out.println(acc.toString());
	}

	void accInfo() throws BankException { //조회
		System.out.println("[계좌조회]");
		System.out.print("계좌번호 : ");
		String id=sc.nextLine();
		
		Account acc= new Account();
		acc = searchAccById(id);
		if(acc==null) {
			throw new BankException("계좌번호가 틀립니다", ERR_CODE.ACCID_ERR);
		}

		System.out.println(acc.toString());
	}

	void allAccInfo() { //전체 계좌 조회
		System.out.println("[전체 계좌조회]");
		for(int i=0; i<cnt;i++) {
			System.out.println(accs[i]);
		}
	}
	
	void transfer() throws BankException { //이체
		System.out.println("[계좌 이체]");
		System.out.print("보내는 계좌번호 : ");
		String sid=sc.nextLine();
		
		Account sacc= new Account();
		sacc = searchAccById(sid);
		if(sacc==null) {
//			System.out.println("보내는 계좌번호가 틀립니다.");
//			return;
			throw new BankException("보내는 계좌번호가 틀립니다", ERR_CODE.ACCID_ERR);

		}
		
		System.out.print("이체 할 계좌번호 : ");
		String rid=sc.nextLine();
		

		
		Account racc= new Account();
		racc = searchAccById(rid);
		if(racc==null) {
//			System.out.println("받는 계좌번호가 틀립니다.");
//			return;
			throw new BankException("받는 계좌번호가 틀립니다", ERR_CODE.ACCID_ERR);

		}
		
		System.out.print("이체 금액:");
		int money=Integer.parseInt(sc.nextLine());
		if(money<0) {
			throw new BankException("이체 금액을 확인하세요", ERR_CODE.DEPOSIT_ERR);
		}
		if(!sacc.withdraw(money)) {
//			System.out.println("잔액이 부족합니다");
//			return;
			throw new BankException("잔액이 부족합니다", ERR_CODE.WITHDRAW_ERR);
			
		}
		racc.deposit(money);
		
		System.out.println(String.format("이체 후 남은 잔액 : %s", sacc.toString()));
		
	
	}
	
	

	

}
