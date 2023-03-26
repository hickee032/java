package Account;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arge) {

		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택>>");

			int menu = scanner.nextInt();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				accountList();
			}else if (menu == 3) {
				deposit();
			}else if (menu == 4) {
				withdraw();
			}else if (menu==5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못입력");
			}
				
		}

	}

	// 계좌생성
	private static void createAccount() {
		System.out.println("--계좌 생성--");
		System.out.print("계좌번호");
		String ano = scanner.next();

		System.out.print("계좌주");
		String owner = scanner.next();

		System.out.print("초기입금액");
		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌 생성 되었음");
				break;
			}
		}

	}

	private static void accountList() {
		System.out.println("--계좌 목록--");
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			/// account인스턴스가 null이 아닐것일때만 출력 아니면 오류

			if (account != null) {

			}

		}
	}

	private static void deposit() {
		System.out.println("--예금--");
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌 없음");
			return;
		}
		account.setBalance(account.getBalance()+money);
		//기존금액에 예금을 더한것
		
	}

	private static void withdraw() {

	}

	private static Account findAccount(String ano) {
		
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbano = accountArray[i].getAno();
				if(dbano.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		

		return account;
	}

}
