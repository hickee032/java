package sec_verify02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SortSearchExample {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.print("학생수를 입력하세요 >>");

		int hp = sc.nextInt();

		String[][] stu = new String[hp][2];

		sc.nextLine();

		for (int i = 0; i < stu.length; i++) {

			System.out.print("[" + i + "]번째 학생 학번 : ");
			stu[i][0] = sc.nextLine();

			System.out.print("[" + i + "]번째 학생 이름 : ");
			stu[i][1] = sc.nextLine();
		}

		System.out.println("-----------------------------------------\n" + "학번 내림차순대로 정렬합니다.");

		Arrays.sort(stu, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {

				return o2[0].compareTo(o1[0]);
			}

		});
		for (int i = 0; i < stu.length; i++) {
			String h = stu[i][0];
			String n = stu[i][1];

			System.out.println("학번[" + i + "] = " + h + "\t이름[" + (i) + "] = " + n);
		}
		System.out.println("-----------------------");
		

		System.out.print("찾고 싶은 학생의 학번 :");

		String input = sc.nextLine();
		System.out.println(input);
		
		int index = Arrays.binarySearch(stu[hp-1], input);
		
		System.out.println(Arrays.toString(stu[0]));
		System.out.println(Arrays.toString(stu[1]));
		System.out.println(Arrays.toString(stu[2]));
		
		System.out.println(stu[index][0]);
		

	}

}
