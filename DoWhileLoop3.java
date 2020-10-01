package demo_1;

import java.util.Scanner;

public class DoWhileLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字(想跳出請輸入0):");
		int i = 0;//設i為正數
		int j = 0;//設j為負數
		
		while(true) {
			
			int number = scan.nextInt();
			
			if(number > 0) {
				i++;
			}else if(number < 0) {
				j++;
			}else{
				break;//輸入的數不是正數 也不是負數 那只有0了 所以輸入0就跳出
			}
			
			System.out.println("輸入的正整數有:" + i);
			System.out.println("輸入的負整數有:" + j);
		}
	}

}
