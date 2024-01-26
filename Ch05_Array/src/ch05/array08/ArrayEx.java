package ch05.array08;

import java.util.Arrays;
import java.util.Scanner;

// 배열의 얕은 복사/깊은 복사
public class ArrayEx {
	public static void main(String[] args) {	
		int[] scores = {98, 12, 52, 93, 33, 54, 21};
		System.out.println(Arrays.toString(scores));
		
		Arrays.sort(scores);
		
		System.out.println(Arrays.toString(scores));
	}
}
