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
		
	/*	Scanner input = new Scanner(System.in);
		int score=0, best=100,random,n1=0,end=0;
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
				end = 0;
				int ran = (int)(Math.random()*99);
				random = ran;
				System.out.println("컴퓨터 숫자 : "+random);
				System.out.println("=== START ===");
				while(true) {
					score++;
					System.out.println("Input Number --> ");
					n1 = input.nextInt();
					if(n1 == random) {
						System.out.println(score+"회 만에 맞췄습니다!");
						if(score<best) {
							best = score;
							System.out.println("최고 기록 달성");
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
					System.out.println("게임을 시작하지 않았습니다");
				}else {
					System.out.println("최고 점수는 "+best+"회 입니다!!!");
				}
				break;
			}
			}*/
		
	
	
		
	
	

		
			
		
			
		
		
		
		
		
			
			
		
		
		
		
		
	}
}
