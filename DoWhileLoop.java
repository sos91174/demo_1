package demo_1;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//do while不管條件如何 都會先執行一次
		//印出100以內的偶數
		int num = 1;
		do {
			
			if(num % 2 == 0) {
				System.out.println(num);
			}
			
			num++;
			
		}while(num <= 100);//條件寫在最後面
//================================================		
		
		//印出100以內的奇數
		int num2 = 1;
		do {
					
			if(num2 % 2 == 1) {
				System.out.println(num2);
			}
					
			num2++;
					
		}while(num2 <= 100);//條件寫在最後面
		
		
		
	
	}

}
