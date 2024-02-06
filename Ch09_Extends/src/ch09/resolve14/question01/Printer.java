package ch09.resolve14.question01;
//1. 다음 상속구조를 설계하세요
//모든 프린터는 모델명, 제조사, 인터페이스 종류(USB, paraller port), 인쇄매수,
//인쇄 종이 잔량을 나타내는 정보를 가진다
//print()메서드를 갖는다.
//잉크젯프린터는 잉크 잔량이라는 추가 정보를 가진다
//레이저프린터는 토너 잔량이라는 추가 정보를 가진다
//print()메서드는 각 프린터 타입에 맞게 구현한다
//편의상 print()메서드를 한 번 호출할 때마다 인쇄용지 1매를 사용하는 것으로 한다
//클래스들을 설계하고
//적절한 필드, 생성자, 메서드를 작성하세요
//그리고 실행 프로그램을 작성해서 동작시키세요
//
//
//                  프린터
//
//잉크젯프린터             레이저프린터

public class Printer {
	protected String modelName;
	protected String manufacturer;
	protected P_INTERFACE pInterface;
	protected int printCount;
	protected int paperRemains;
	
	public Printer(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount, int paperRemains) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.pInterface = pInterface;
		this.printCount = printCount;
		this.paperRemains = paperRemains;
	}
	
	public void print() {
		this.paperRemains--;
	}	
}














