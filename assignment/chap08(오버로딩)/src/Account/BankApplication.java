package Account;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arge) {

		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------------");
			System.out.print("����>>");

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
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�߸��Է�");
			}
				
		}

	}

	// ���»���
	private static void createAccount() {
		System.out.println("--���� ����--");
		System.out.print("���¹�ȣ");
		String ano = scanner.next();

		System.out.print("������");
		String owner = scanner.next();

		System.out.print("�ʱ��Աݾ�");
		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("���� ���� �Ǿ���");
				break;
			}
		}

	}

	private static void accountList() {
		System.out.println("--���� ���--");
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			/// account�ν��Ͻ��� null�� �ƴҰ��϶��� ��� �ƴϸ� ����

			if (account != null) {

			}

		}
	}

	private static void deposit() {
		System.out.println("--����--");
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("���� ����");
			return;
		}
		account.setBalance(account.getBalance()+money);
		//�����ݾ׿� ������ ���Ѱ�
		
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
