package ch03.controll06;

import java.util.Scanner;

public class IfElesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 봄");
		System.out.println("2. 여름");
		System.out.println("3. 가을");
		System.out.println("4. 겨울");
		System.out.println("선택 >> ");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
//		sel의 값과 같은 case로 이동하여 실행하고 
//		break를 만나면 switch문이 종료된다.
		
		switch (sel) {
		case 1: 
			System.out.println("새싹이 자라난다");
			break;
		case 2:
			System.out.println("산과 바다로 가자");
			break;
		case 3:
			System.out.println("책을 읽자");
			break;
		case 4:
			System.out.println("스키장에 간다");
			break;
	
		}
		
	}
	
}