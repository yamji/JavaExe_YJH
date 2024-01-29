package ch05.array04;

import java.util.Scanner;

//3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
public class Reslorve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] kor = new int[7];
		
		for(int i=0; i<kor.length; i++) {
			System.out.println((i+1) + "번째 학생의 학점");
			kor[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<kor.length; i++) {
			sum += kor[i];
			
		}
		double avg = sum/kor.length;
		System.out.println("학점" + sum);
		System.out.println("평균" + avg);
		sc.close();
	}

}
