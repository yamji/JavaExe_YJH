package ch05.array04;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		String[] names = {"홍길동", "임꺽정",
				"잠길산", "일지매", "차돌바위"};
		
		System.out.println(Arrays.toString(names));
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i] + " ");
		}
		System.out.println();
	}
	
}
