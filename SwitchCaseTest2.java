package demo_1;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		
		//判斷分數是否及格
		int score = 82;
		//可以先把分數除10就不用寫太多case
		switch(score/10) {
		//相同的輸出 可以省略
		case 10:
		case 9:
		case 8:
		case 7:
		case 6:
			System.out.println("分數及格");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("分數不及格");
			break;
			
			
		}

	}

}
