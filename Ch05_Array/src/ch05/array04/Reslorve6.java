package ch05.array04;

import java.util.Scanner;

public class Reslorve6 {
	public static void main(String[] args) {
		String[] nameArr = new String[5];
		int[] scoreArr = new int[5];
		char[] chScoreArr = new char[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<nameArr.length; i++) {
			System.out.print((i+1) + "번째 학생 이름 >> ");
			String name = sc.nextLine();
			System.out.print((i+1) + "번째 학생 점수 >> ");
			String strScore = sc.nextLine();
			int score = Integer.parseInt(strScore);
			
			nameArr[i] = name;
			scoreArr[i] = score;
		}
		
		/*점수를 학점으로 변환*/
		for(int i=0; i<scoreArr.length; i++) {
			char chscore;
			int score = scoreArr[i];
			if(score >= 90)
				chscore = 'A';
			else if(score >= 80)
				chscore ='B';
			else if(score >= 70)
				chscore ='C';
			else if(score >= 60)
				chscore ='D';
			else
				chscore = 'F';
			
			chScoreArr[i] = chscore;
		}
		
		/*학생 이름과 학점 출력*/
		for(int i =0; i<nameArr.length; i++) {
			System.out.printf("%d %s:%c:\n",
					(i+1), nameArr[i], chScoreArr[i]);
		}
		
		sc.close();
	}

}
