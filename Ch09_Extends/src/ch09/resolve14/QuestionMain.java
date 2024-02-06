package ch09.resolve14;

import java.util.Scanner;

public class QuestionMain {
	
	IQuestionAnswer[] qaArr = {
		new Answer1(),
		new Answer2(),
		new Answer3(),
		new Exit()
	};
	
	public int getSelectQuestion(Scanner sc) {
		System.out.print("\n\n문제 번호 선택 >> ");
		int num = sc.nextInt();
		return num;
	}
	public void printQuestion() {
		for(int i=0;i<qaArr.length;i++) {
			qaArr[i].question();
		}
	}	

	public static void main(String[] args) {
		QuestionMain qm = new QuestionMain();
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		while(isRun) {
			qm.printQuestion();
			int sel = qm.getSelectQuestion(sc);
			
			if(sel >= 1 && sel <= qm.qaArr.length) {
				// 인덱스는 입력값보다 1 작으므로 
				IQuestionAnswer iqa = qm.qaArr[sel-1];
				iqa.answer(sc);	
				isRun = iqa.isRun();
			}else {
				System.out.println("문제 번호 잘 못 선택했습니다~~");
			}
		}
		System.out.println("Program End~");		
		
		sc.close();
	}
}



