package day10_ClassVariable;

import java.util.Scanner;

public class Quiz_Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Quiz_Class qz = new Quiz_Class();
		int num;
		while(true) {
			System.out.println("=== UP & DOWN Game ===");
			System.out.println("  1. ���ӽ���");
			System.out.println("  2. ��������");
			System.out.println("  3. ��������");
			System.out.print(">>>> ");
			num = input.nextInt();
			if(num ==3) {
				System.out.println("���� �մϴ�!!!");
				break;
			}
			switch(num) {
			case 1:
				qz.end = 0;
				qz.start();
				qz.score =0;
				break;
			case 2:
				qz.highRecord();
				break;
			}
			}
		
	/*	Scanner input = new Scanner(System.in);
		int score=0, best=100,random,n1=0,end=0;
		int num;
		while(true) {
			System.out.println("=== UP & DOWN Game ===");
			System.out.println("  1. ���ӽ���");
			System.out.println("  2. ��������");
			System.out.println("  3. ��������");
			System.out.print(">>>> ");
			num = input.nextInt();
			if(num ==3) {
				System.out.println("���� �մϴ�!!!");
				break;
			}
			switch(num) {
			case 1:
				end = 0;
				int ran = (int)(Math.random()*99);
				random = ran;
				System.out.println("��ǻ�� ���� : "+random);
				System.out.println("=== START ===");
				while(true) {
					score++;
					System.out.println("Input Number --> ");
					n1 = input.nextInt();
					if(n1 == random) {
						System.out.println(score+"ȸ ���� ������ϴ�!");
						if(score<best) {
							best = score;
							System.out.println("�ְ� ��� �޼�");
						}
						end =1;
					}else if(n1<random) {
						System.out.println("=== UP ===");
					}else {
						System.out.println("=== Down ===");
					}
					if(end == 1) {
						break;
					}
				//	score=0;
				}
				score=0;
				break;
			case 2:
				if(best == 100) {
					System.out.println("������ �������� �ʾҽ��ϴ�");
				}else {
					System.out.println("�ְ� ������ "+best+"ȸ �Դϴ�!!!");
				}
				break;
			}
			}*/
		
	
	
		
	
	

		
			
		
			
		
		
		
		
		
			
			
		
		
		
		
		
	}
}
