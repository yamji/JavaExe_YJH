package ch05.array04;

import java.util.Scanner;

//5. int배열을 10개 생성하세요.
//사용자로부터 10개의 값을 입력받고
//순서대로 출력하고  총합을 구하세요

public class Reslorve5 {
	public static void main(String[] args) {
		int[] numArr = new int [10];
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<numArr.length; i++) {
			int num = sc.nextInt();
			total += num;
			numArr[i] = num;
		}
		
		for(int num : numArr)
			System.out.print(num + " ");
		System.out.println();
		System.out.println("총합 : " + total);
		
		sc.close();
		
	}
	

}
