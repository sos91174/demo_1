package demo_1;

public class Car {
	
	private String color;
	private char door;
	private int year;
	
	public Car() {
		
	}
	public Car(String color,char door,int year) {
		
	}
	
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", door=" + door + ", year=" + year + "]";
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getDoor() {
		return door;
	}
	public void setDoor(char door) {
		this.door = door;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	

}
