package ch03.While08;

public class Resolve4 {
	public static void method1() {
		int num=1;
		while(num <= 10) {
			if(num%2==0)
				System.out.println(num);
			num++;
		}		
	}
	public static void method2() {
		int num=2;
		while(num <= 10) {
			System.out.println(num);
			num+=2;
		}	
	}
	public static void main(String[] args) {
//		method1();
		method2();
	}

}