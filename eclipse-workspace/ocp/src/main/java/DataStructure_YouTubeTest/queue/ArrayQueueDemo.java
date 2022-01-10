package DataStructure_YouTubeTest.queue;

import java.util.Scanner;

public class ArrayQueueDemo {

	public static void main(String[] args) {
		//測試開始
		//創建一個隊列
		ArrayQueue queue = new ArrayQueue(3);
		char key = ' ';//接收用戶輸入
		Scanner scanner = new Scanner(System.in);//
		boolean loop = true;
		//輸出一個菜單
		while(loop) {
			System.out.println("s(show):顯示隊列");
			System.out.println("e(exit):退出隊列");
			System.out.println("a(add):添加數據到隊列");
			System.out.println("g(get):從隊列取出數據");
			System.out.println("h(head):查看隊列頭的數據");
			key = scanner.next().charAt(0);//接收一個字符
			switch (key) {
			case 's':
				queue.showQueue();
				break;
			case 'a':
				System.out.println("輸出一個數");
				int value = scanner.nextInt();
				queue.addQueue(value);
				break;
			case 'g': //取出數據
				try {
					int res = queue.getQueue();
					System.out.printf("取出的數據是%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'h': //查看隊列頭的數據
				try {
					int res = queue.headQueue();
					System.out.printf("隊列頭的數據是%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'e': //退出
				scanner.close();
				loop = false;
				break;
			default:
				break;
			
			}
		}
		System.out.println("程序退出");
	}

}

//使用數組模擬隊列-編寫一個ArrayQueue類
class ArrayQueue {
	private int maxSize; // 表示數組最大容量
	private int front;   // 隊列頭
	private int rear;    // 隊列尾
	private int[] arr;   // 該數據用於存放數據，模擬隊列
	
	//創建隊列的構造器
	public ArrayQueue(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
		front = -1; // 指向隊列頭，分析出front是指向隊列頭的前一個位置
		rear = -1;  // 指向隊列尾，指向隊列尾的數據(即是隊列最後一個數據)
	}
	
	//判斷隊列是否滿
	public boolean isFull() {
		return rear == maxSize - 1;
	}
	
	//判斷對列是否為空
	public boolean isEmpty() {
		return rear == front;
	}
	
	//添加數據到隊列
	public void addQueue(int n) {
		//判斷隊列是否滿
		if(isFull()) {
			System.out.println("隊列滿不能加入數據");
			return;
		}
		rear++; //讓rear 後移
		arr[rear] = n;
	}
	
	//獲取隊列的數據，出隊列
	public int getQueue() {
		//判斷隊列是否為空
		if(isEmpty()) {
			//通過拋出異常
			throw new RuntimeException("隊列空，不能取數據");
		}
		front++; //front 後移
		return arr[front];
	}
	//顯示隊列所有數據
	public void showQueue() {
		//遍歷
		if (isEmpty()) {
			System.out.println("隊列空的沒有數據");
			return;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}
	}
	//顯示隊列頭的數據，注意不是取出數據
	public int headQueue() {
		//判斷
		if (isEmpty()) {
			throw new RuntimeException("隊列空的沒有數據");
		}
		return arr[front+1];
	}
}
