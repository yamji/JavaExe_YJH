package ch05.array04;
//2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요

public class Reslorve2 {
	public static void main(String[] args) {
		String[] names = {"가", "나", "다", "라", "마", "바", "사",
				"아", "자", "차"};
		for(int i = 9; i>=0; i--) {
			System.out.println(names[i] + " ");
		}
		System.out.println();
		
	}

}
