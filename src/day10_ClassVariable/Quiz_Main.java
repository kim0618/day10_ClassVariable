package day10_ClassVariable;

import java.util.Scanner;

public class Quiz_Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Quiz_Class qz = new Quiz_Class();
		int num;
		while(true) {
			System.out.println("=== UP & DOWN Game ===");
			System.out.println("  1. 게임시작");
			System.out.println("  2. 게임전적");
			System.out.println("  3. 게임종료");
			System.out.print(">>>> ");
			num = input.nextInt();
			if(num ==3) {
				System.out.println("종료 합니다!!!");
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
			
			
	/*	Scanner sc = new Scanner(System.in);
		Quiz_Class qz = new Quiz_Class();
		int select;
		while(true) {
			System.out.println("=== UP & DOWN Game ===");
			System.out.println("  1. 게임시작");
			System.out.println("  2. 게임전적");
			System.out.println("  3. 게임종료");
			System.out.print(">>>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				qz.end = 0;
				qz.gameStart();
				break;
			case 2:
				qz.gameRecords();
				break;
			case 3:
				System.out.println("종료합니다.");
				System.exit(1); 
			}
		}*/
		

		
			
		
			
		
		
		
		
		
			
			
		
		
		
		
		
	}
}
