package sec01_exam;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String position = null;
		
		System.out.println("���� �Է�");
		position = scan.nextLine();
		//���� switch()���� ���� int������ ���� �������� �����ϰ� stringŸ���� ���
			
			switch(position) {
				case "����":
					System.out.println("500");
					break;
				case "����":
					System.out.println("500");
					break;
				case "����":
					System.out.println("500");
					break;
				case "�븮":
					System.out.println("500");
					break;
				case "���":
					System.out.println("500");
					break;
				default:
					System.out.println("300");
				}
			scan.close();

			}
		
		}
