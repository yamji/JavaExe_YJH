package ch05.array04;
//4. int배열을 10개 생성하세요.
//int배열에 3의 배수를 차례대로 저장하세요.
//그리고 거꾸로 출력하세요.

public class Reslorve4 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 3*(i+1);
		}
		for(int i=9; i>=0; i--) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

}
