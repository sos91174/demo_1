package demo_1;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("請輸入一個數字(1-5):");
		
		int a = scan.nextInt();
		
		switch(a) {
		
		case 0:
			System.out.println("答案是0");
			break;//switch要記得加break不然不會終止
		case 1:
			System.out.println("答案是1");
			break;
		case 2:
			System.out.println("答案是2");
			break;
		case 3:
			System.out.println("答案是3");
			break;
		case 4:
			System.out.println("答案是4");
			break;
		case 5:
			System.out.println("答案是5");
			break;
		default:
			System.out.println("你輸入的資料有誤");
		
		
		
		
		}
		

	}

}
