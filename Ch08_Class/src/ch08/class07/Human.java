package ch08.class07;

/*
 * 클래스로 묶은 변수를 쉽게 접근 허용하는 것은
 * 프로그래밍의 오류를 가져오게 되는 중대한 원인이 된다는 사실을
 * 경험적으로 알게 되었다.
 * 
 * 그래서 클래스 내부에서만 사용한다는 개념(private)과
 * 밖에서도 접근한다는 개념(public)이 등장하게 되었다.
 * */

public class Human {
	private String name;
	private int age;
	private double score;
	
	public void setName(String _name) {
		name = _name;
	}
	public void setAge(String _age) {
		name = _age;
	}
	public void setScore(String _score) {
		name = _score;
	}
}
