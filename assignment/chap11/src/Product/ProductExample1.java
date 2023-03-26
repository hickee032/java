package Product;

import java.util.Scanner;

public class ProductExample1 {

	static int productID = 0;

	static int numberOfProduct = 0;

	static Product[] p = new Product[10];

	private static void addProduct(int type) {

		Scanner scan = new Scanner(System.in);

		if (type == 1) {

			System.out.print("상품 설명>> ");
			String Bookdescription = scan.nextLine();
			System.out.print("생산자>> ");
			String Bookmaker = scan.nextLine();
			System.out.print("가격>> ");
			int BookPrice = scan.nextInt();
			scan.nextLine();
			System.out.print("책 제목>> ");
			String Booktitle = scan.nextLine();
			System.out.print("저자>> ");
			String Bookauthor = scan.nextLine();
			System.out.print("국제표준도서번호(ex.0001)");
			int BookISBN = scan.nextInt();
			scan.nextLine();

			p[0] = new Book(1, Bookdescription, Bookmaker, BookPrice, BookISBN, Booktitle, Bookauthor);

		}

		if (type == 2) {
			System.out.print("상품 설명>> ");
			String CompactDiscdescription = scan.nextLine();
			System.out.print("생산자>> ");
			String CompactDiscmaker = scan.nextLine();
			System.out.print("가격>> ");
			int CompactDiscPrice = scan.nextInt();
			scan.nextLine();
			System.out.print("엘범 제목>> ");
			String CompactDiscalbumTitle = scan.nextLine();
			System.out.print("가수>> ");
			String CompactDiscartist = scan.nextLine();
			scan.nextLine();
			
			p[1] = new CompactDisc(2, CompactDiscdescription, CompactDiscmaker, CompactDiscPrice, CompactDiscalbumTitle,
					CompactDiscartist);

		}

		if (type == 3) {
			System.out.print("상품 설명>> ");
			String Bookdescription = scan.nextLine();
			System.out.print("생산자>> ");
			String Bookmaker = scan.nextLine();
			System.out.print("가격>> ");
			int BookPrice = scan.nextInt();
			scan.nextLine();
			System.out.print("책 제목>> ");
			String Booktitle = scan.nextLine();
			System.out.print("저자>> ");
			String Bookauthor = scan.nextLine();
			System.out.print("언어>> ");
			String Booklanguage = scan.nextLine();
			System.out.print("국제표준도서번호(ex.0001)");
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

			System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3)>> ");
			int type = scan.nextInt();

			if (type == 1) {
				System.out.print("상품 종류 책(1), 음악CD(2), 회화책(3)>> ");
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
				System.out.println("프로그램 종료");
			}

		}

	scan.close();}

}
