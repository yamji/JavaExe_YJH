package ch05.array02;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int 변수 공간 3개 만들어줘. 대표이름은 kor
		int[] kor = new int[3];
		
		
		//3명의 국어점수 입력
		
		System.out.print("1번째 학생 국어점수 입력 >>");
		kor[0] =sc.nextInt();
		System.out.print("2번째 학생 국어점수 입력 >>");
		kor[1]= sc.nextInt();
		System.out.print("3번째 학생 국어점수 입력 >>");
		kor[2]= sc.nextInt();
		
		int total = 0;
		double avg = 0.;
		for(int i =0; i<3; i++) {
			total += kor[i];
		}
		avg = total/kor.length;
		
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", + avg);
		
		sc.close();
	}

}
