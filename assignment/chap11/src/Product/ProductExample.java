package Product;

import java.util.Scanner;

public class ProductExample {

	static int productID = 0;

	static int numberOfProduct = 0;

	static Product[] p = new Product[10];

	private static void addProduct(int type) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3)>>");

			int select = scan.nextInt();

			if (select == 1) {

				System.out.print("상품 종류 책(1), 음악CD(2), 회화책(3)>>");

				int select2 = scan.nextInt();

				if (select2 == 1) {

					String Bookdescription = scan.nextLine();

					String Bookmaker = scan.nextLine();

					int BookPrice = scan.nextInt();

					String Booktitle = scan.nextLine();

					String Bookauthor = scan.nextLine();

					System.out.print("국제표준도서번호(ex.0001)");

					int BookISBN = scan.nextInt();

					p[0] = new Book(1, Bookdescription, Bookmaker, BookPrice, BookISBN, Booktitle, Bookauthor);

				}

				if (select2 == 2) {

					String CompactDiscdescription = scan.nextLine();

					String CompactDiscmaker = scan.nextLine();

					int CompactDiscPrice = scan.nextInt();

					String CompactDiscalbumTitle = scan.nextLine();

					String CompactDiscartist = scan.nextLine();

					p[1] = new CompactDisc(2, CompactDiscdescription, CompactDiscmaker, CompactDiscPrice,
							CompactDiscalbumTitle, CompactDiscartist);

				}

				if (select2 == 3) {

					String Bookdescription = scan.nextLine();

					String Bookmaker = scan.nextLine();

					int BookPrice = scan.nextInt();

					String Booktitle = scan.nextLine();

					String Bookauthor = scan.nextLine();

					String Booklanguage = scan.nextLine();

					System.out.print("국제표준도서번호(ex.0001)");

					int BookISBN = scan.nextInt();

					p[2] = new ConversationBook(3, Bookdescription, Bookmaker, BookPrice, BookISBN, Booktitle,
							Bookauthor, Booklanguage);

				}
			}
			if (select == 2) {
//				for(int i = 0 ; i<p.length;i++) {
//					
//				}				
				p[0].showInfo();
				p[1].showInfo();
				p[2].showInfo();
			}
			if (select == 3) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		ProductExample.addProduct(numberOfProduct);

	}

}
