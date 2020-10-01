package demo_1;

import java.util.Scanner;
class If_else {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("請輸入你的考試分數(0-100):");
		int score = scan.nextInt();

		if(score == 100){
			System.out.println("送你最高規格Mac pro");//be my wife!  BMW <---> MSN
		}else if(score > 80 &&  score <= 99){
			System.out.println("送你iphone 11");
		}else if(score >= 60 && score <= 80){
			System.out.println("送你iphone SE");
		}else{
			System.out.println("你這次考太爛了");
		}
	}
}
