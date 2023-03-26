package Product;

import java.util.Scanner;

public class ProductExample1 {

	static int productID = 0;

	static int numberOfProduct = 0;

	static Product[] p = new Product[10];

	private static void addProduct(int type) {

		Scanner scan = new Scanner(System.in);

		if (type == 1) {

			System.out.print("��ǰ ����>> ");
			String Bookdescription = scan.nextLine();
			System.out.print("������>> ");
			String Bookmaker = scan.nextLine();
			System.out.print("����>> ");
			int BookPrice = scan.nextInt();
			scan.nextLine();
			System.out.print("å ����>> ");
			String Booktitle = scan.nextLine();
			System.out.print("����>> ");
			String Bookauthor = scan.nextLine();
			System.out.print("����ǥ�ص�����ȣ(ex.0001)");
			int BookISBN = scan.nextInt();
			scan.nextLine();

			p[0] = new Book(1, Bookdescription, Bookmaker, BookPrice, BookISBN, Booktitle, Bookauthor);

		}

		if (type == 2) {
			System.out.print("��ǰ ����>> ");
			String CompactDiscdescription = scan.nextLine();
			System.out.print("������>> ");
			String CompactDiscmaker = scan.nextLine();
			System.out.print("����>> ");
			int CompactDiscPrice = scan.nextInt();
			scan.nextLine();
			System.out.print("���� ����>> ");
			String CompactDiscalbumTitle = scan.nextLine();
			System.out.print("����>> ");
			String CompactDiscartist = scan.nextLine();
			scan.nextLine();
			
			p[1] = new CompactDisc(2, CompactDiscdescription, CompactDiscmaker, CompactDiscPrice, CompactDiscalbumTitle,
					CompactDiscartist);

		}

		if (type == 3) {
			System.out.print("��ǰ ����>> ");
			String Bookdescription = scan.nextLine();
			System.out.print("������>> ");
			String Bookmaker = scan.nextLine();
			System.out.print("����>> ");
			int BookPrice = scan.nextInt();
			scan.nextLine();
			System.out.print("å ����>> ");
			String Booktitle = scan.nextLine();
			System.out.print("����>> ");
			String Bookauthor = scan.nextLine();
			System.out.print("���>> ");
			String Booklanguage = scan.nextLine();
			System.out.print("����ǥ�ص�����ȣ(ex.0001)");
			int BookISBN = scan.nextInt();
			scan.nextLine();

			p[2] = new ConversationBook(3, Bookdescription, Bookmaker, BookPrice, BookISBN, Booktitle, Bookauthor,
					Booklanguage);
		}
		scan.close();}

	public static void main(String[] args) {

		boolean run = true;
		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3)>> ");
			int type = scan.nextInt();

			if (type == 1) {
				System.out.print("��ǰ ���� å(1), ����CD(2), ȸȭå(3)>> ");
				int select = scan.nextInt();

					if (select == 1) {
						ProductExample1.addProduct(1);
					}
	
					else if (select == 2) {
						ProductExample1.addProduct(2);
					}
	
					else if (select == 3) {
						ProductExample1.addProduct(3);
					}
			}
			if (type == 2) {

				p[0].showInfo();
				p[1].showInfo();
				p[2].showInfo();
			}

			if (type == 3) {
				run = false;
				System.out.println("���α׷� ����");
			}

		}

	scan.close();}

}
