package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {

	// �ν��Ͻ� ������ ����
	// �Է�, ��� ������� ��������
	public int age;
	public String name;
	public void display() {
		Scanner input = new Scanner(System.in);
	//	int age;
	//	String name;
		System.out.println("�̸� �Է� : ");
		name = input.next();
		System.out.println("���� �Է� : ");
		age = input.nextInt();
	//	dis(name, age);
	}
	
	public void dis(){// (String name,int age) {
		System.out.println("�̸� : "+name);
		System.out.println("age : "+age);
	}
	
	
	
	
	
	}
	
	

