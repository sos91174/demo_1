package demo_1;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		while(i <= 100) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
			i++;//i++ 一定要加不然i會一直是1
		}
		
		System.out.println(i);
		//執行最後一次前會再做最後一次i++所以是101

	}

}
