package demo_1;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {

		Car a = new Car();
		a.setColor("red");	
		a.setDoor('6');
		a.setYear(2200);
		System.out.print("車子顏色是:"+a.getColor()+"\n"+"車子是幾門的:"+a.getDoor()+"\n"+"車子年份:"+a.getYear());
		

		

	}

}
