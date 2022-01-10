package DataStructure_YouTubeTest.queue;

import java.util.Scanner;

public class CircleArrayQueue {

	public static void main(String[] args) {

		// 測試開始
		System.out.println("");
		// 創建一個隊列
		CircleArray queue = new CircleArray(4);  //說明設置4, 其隊列的有效數據最大是3
		char key = ' ';// 接收用戶輸入
		Scanner scanner = new Scanner(System.in);//
		boolean loop = true;
		// 輸出一個菜單
		while (loop) {
			System.out.println("s(show):顯示隊列");
			System.out.println("e(exit):退出隊列");
			System.out.println("a(add):添加數據到隊列");
			System.out.println("g(get):從隊列取出數據");
			System.out.println("h(head):查看隊列頭的數據");
			key = scanner.next().charAt(0);// 接收一個字符
			switch (key) {
			case 's':
				queue.showQueue();
				break;
			case 'a':
				System.out.println("輸出一個數");
				int value = scanner.nextInt();
				queue.addQueue(value);
				break;
			case 'g': // 取出數據
				try {
					int res = queue.getQueue();
					System.out.printf("取出的數據是%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'h': // 查看隊列頭的數據
				try {
					int res = queue.headQueue();
					System.out.printf("隊列頭的數據是%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'e': // 退出
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

class CircleArray {
	private int maxSize; // 表示數組最大容量
	// front 變量的含義做一個調整: front 就指向隊列第一個元素, Arr[front]
	// front 的初始值 = 0
	private int front;
	// rear 變量的含義做一個調整: rear 指向隊列的最後一個元素的後一個位置,
	// rear 的初始值為 = 0
	private int rear; // 隊列尾
	private int[] arr; // 該數據用於存放數據，模擬隊列

	public CircleArray(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
	}

	// 判斷隊列是否滿
	public boolean isFull() {
		return (rear + 1) % maxSize == front;
	}

	// 判斷對列是否為空
	public boolean isEmpty() {
		return rear == front;
	}

	// 添加數據到隊列
	public void addQueue(int n) {
		// 判斷隊列是否滿
		if (isFull()) {
			System.out.println("隊列滿不能加入數據");
			return;
		}
		// 直接將數據加入即可
		arr[rear] = n;
		// 將 rear 後移, 這裡必需考慮取模
		rear = (rear + 1) % maxSize;
	}

	// 獲取隊列的數據，出隊列
	public int getQueue() {
		// 判斷隊列是否為空
		if (isEmpty()) {
			// 通過拋出異常
			throw new RuntimeException("隊列空，不能取數據");
		}
		// 這裡需要分析出 front是指向隊列的第一個元素
		// 1. 先把front 對應的值保留到個臨時變量
		// 2. 將 front 後移, 考慮取模
		// 3. 將臨時保存的變量返回
		int value = arr[front];
		front = (front + 1) % maxSize;
		return value;

	}

	// 顯示隊列所有數據
	public void showQueue() {
		// 遍歷
		if (isEmpty()) {
			System.out.println("隊列空的沒有數據");
			return;
		}
		// 思路: 從 frontd9 開始遍歷, 遍歷多少個元素
		// 動腦筋
		for (int i = front; i < front + size(); i++) {
			System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
		}
	}

	// 求出當隊列有效數據的個數
	public int size() {
		// rear = 2
		// front = 1
		// maxSize = 3
		return (rear + maxSize - front) % maxSize;
	}

	// 顯示隊列頭的數據，注意不是取出數據
	public int headQueue() {
		// 判斷
		if (isEmpty()) {
			throw new RuntimeException("隊列空的沒有數據");
		}
		return arr[front];
	}

}