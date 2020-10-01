package demo_1;

import java.util.Scanner;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//查詢今天是今年的第幾天
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入月份:");
		int month = scan.nextInt();
		System.out.println("請輸入日期:");
		int day = scan.nextInt();
		
		int sumDays = 0;
		
		switch(month){
		//case 數字表示月份 不要加break就不會跳出
		case 12:
			sumDays += 30;
		case 11:
			sumDays += 31;
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			sumDays += 28;
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}

		System.out.println("2020年" + month + "月" + day + "日是今年的第" + sumDays + "天");
	}
}
