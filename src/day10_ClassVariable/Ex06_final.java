package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_final {
	// final = 값을 변경하지 못하게 하는 것
	public String KOREA = "대한민국";
	public void func () {
		System.out.println("변경 전 KOREA : "+KOREA);
		Scanner input = new Scanner(System.in);
		System.out.println("입력 : ");
		KOREA = input.next();
		System.out.println("변경 후 KOREA : "+KOREA);
	}
}
