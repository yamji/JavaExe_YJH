package ch03.for10;

import java.util.Scanner;

public class Resolve2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1~99까지 정수 입력(음수면 종료) >>");
		int num = sc.nextInt();
		if(num < 0)
			break;
	
		int n10 = num/10;
		int n1 = num%10;
	
		int cnt = 0;
		if(n10==3 || n10==5 || n10==9)
			cnt++;
	
		sc.close();
	
		sc.close();
			}
		
	}

