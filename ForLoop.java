package demo_1;

public class ForLoop {

	public static void main(String[] args) {
		
		//200以內的3 5 7 9倍數
		for(int i = 1;i <= 200;i++){
			
			System.out.print(i + "  ");

			if(i % 3 == 0){
				System.out.print("3的倍數    ");
			}

			if(i % 5 == 0){
				System.out.print("5的倍數    ");
			}

			if(i % 7 == 0){
				System.out.print("7的倍數    ");
			}
			if(i % 9 == 0){
				System.out.print("9的倍數    ");
			}
			System.out.println();

		}

	}
}
