package ch05.array03;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		
		/*배열의 초기화
		 * 배열은 클래스이고 kor은 스택에 위치하여
		 * 참조값 (해시코드)이 들어있고
		 * 실제 배열의 값들은 힙(heep)메모리에 위치한다.
		 * 
		 * 정식 선언은 int[] kor = new int[3]이지만
		 * 프로그래머의 편의를 위해 아래처럼 초기화를 허용한다.
		 * C언어때부터의 관습이다.
		 */
		
		int[] kor = {98, 99, 89};
		System.out.println("배열의 크기: " + kor.length);
		
		int[] marh = {100, 80, 78, 68, 90};;
		System.out.println("배열의 크기: " + marh.length);
		
	}
	
}
