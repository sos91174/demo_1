package demo_1;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do while不管條件如何 都會先執行一次
				//印出100以內的偶數 並且分別算總和 還有用了幾個偶數
		int i = 1;//設起始值是1
		int sum = 0;//紀錄總和是多少
		int count = 0;//紀錄用了幾個數字
		do {
					
			if(i % 2 == 0) {
				System.out.println(i);
				sum += i;//每次數字都相加
				count++;//每次執行完+1
			}
					
			i++;
					
		}while(i <= 100);//條件寫在最後面
				
		System.out.println("全部數字加總:" + sum);
		System.out.println("總共用了幾個數字:" + count);
		
		
	}

}
