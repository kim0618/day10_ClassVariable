package day10_ClassVariable;

import java.util.Scanner;

public class Quiz_Class {

	Scanner input = new Scanner(System.in);
	int score=0, best=100,random,n1=0,end=0;
	// input number, updown, ����, �ְ�����
	
	public void start() {
		int ran = (int)(Math.random()*99);
		random = ran;
		System.out.println("��ǻ�� ���� : "+random);
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
			System.out.println(score+"ȸ ���� ������ϴ�!");
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
			System.out.println("�ְ� ��� �޼�");
		}
	}
	
	public void highRecord() {
		if(best == 100) {
			System.out.println("������ �������� �ʾҽ��ϴ�");
		}else {
			System.out.println("�ְ� ������ "+best+"ȸ �Դϴ�!!!");
		}
	}
	
	
}
