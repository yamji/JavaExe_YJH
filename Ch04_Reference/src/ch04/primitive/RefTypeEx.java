package ch04.primitive;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RefTypeEx {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30}; //배열
		String name = "홍길동";     //String 클래스
		int[] arr1 = new int[3];
		arr1[0] =1;
		arr1[1] =2;
		arr[2] =3;
		String name1 = new String("임꺽정");
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(name);
		System.out.println(Arrays.toString(arr1));
		System.out.println(name1);
		
		System.out.println(arr.hashCode());
		System.out.println(name.hashCode());
		
	}
	
}

