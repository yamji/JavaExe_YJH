package ch03.for10;

// 구구단 전체 출력
public class ForEx2 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++)
				System.out.printf("%d*%d=%d\n", i, j, i*j);
			System.out.println();
		}
	}

}
