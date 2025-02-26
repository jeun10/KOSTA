import exc.BankException;

public class BankMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		Loop: while (true) {
			try {
				int sel = bank.selectMenu();

				switch (sel) {
				case 1:
					bank.selMakeAccount();
					break;
				case 2:
					bank.deposit();
					break;
				case 3:
					bank.withdraw();
					break;
				case 4:
					bank.accInfo();
					break;
				case 5:
					bank.allAccInfo();
					break;
				case 6:
					bank.transfer();
					break;
				case 0:
					break Loop;

				}
			} catch (NumberFormatException e) {
				System.out.println("입력값이 바르지 않습니다.");
			}catch (BankException e) {
				System.out.println(e);
			}
		}
	}
}