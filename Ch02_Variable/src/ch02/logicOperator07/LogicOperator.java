package ch02.logicOperator07;

public class LogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean logic;
		
		//And 연산
		logic = true && true;
		System.out.println("true && true => " + logic);
		logic = true && false;
		System.out.println("true && false => " + logic);
		//Or 연산
		logic = true || true;
		System.out.println("true || true => " + logic);
		logic = true || false;
		System.out.println("true || false => " + logic);
		//Xor 연산
		logic = true ^ true;
		System.out.println("true ^ true => " + logic);
		logic = true ^ false;
		System.out.println("true ^ false => " + logic);
		//Not 연산
		logic = ! false;
		System.out.println("!false => " + logic);

	}

}
