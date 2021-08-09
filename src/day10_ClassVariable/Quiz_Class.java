package day10_ClassVariable;

import java.util.Scanner;

public class Quiz_Class {

	Scanner input = new Scanner(System.in);
	int score=0, best=100,random,n1=0,end=0;
	// input number, updown, 전적, 최고점수
	
	public void start() {
		int ran = (int)(Math.random()*99);
		random = ran;
		System.out.println("컴퓨터 숫자 : "+random);
		System.out.println("=== START ===");
		
		while(true) {
			score++;
			System.out.println("Input Number --> ");
			n1 = input.nextInt();
			UpDown();
			
			if(end == 1) {
				break;
			}
			
		}
	}
	
	public void UpDown() {
		if(n1 == random) {
			System.out.println(score+"회 만에 맞췄습니다!");
			highScore();
			end =1;
		}else if(n1<random) {
			System.out.println("=== UP ===");
		}else {
			System.out.println("=== Down ===");
		}
	}
	
	public void highScore() {
		if(score<best) {
			best = score;
			System.out.println("최고 기록 달성");
		}
	}
	
	public void highRecord() {
		if(best == 100) {
			System.out.println("게임을 시작하지 않았습니다");
		}else {
			System.out.println("최고 점수는 "+best+"회 입니다!!!");
		}
	}
	
	
}
