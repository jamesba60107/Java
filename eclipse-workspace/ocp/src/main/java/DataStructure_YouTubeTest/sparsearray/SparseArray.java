package DataStructure_YouTubeTest.sparsearray;

public class SparseArray {

	public static void main(String[] args) {
		// 創建一個的二維數組 11*11
		// 0: 表示沒有棋子, 1:黑子,2:藍子
		int chessArr1[][] = new int[11][11];
		chessArr1[1][2] = 1;
		chessArr1[2][3] = 2;
		// 輸出原始的二維數組
		System.out.println("原始的二維數組");
		for (int[] row : chessArr1) {
			for (int data : row) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
		// 將二維數組 轉 稀疏數組的思路
		// 1. 先遍歷二維數組 得到非0數據的個數
		int sum = 0;
		for (int i = 0; i < chessArr1.length; i++) {
			for (int j = 0; j < chessArr1.length; j++) {
				if (chessArr1[i][j] != 0) {
					sum++;
				}
			}
		}

		// 2. 創建對應的稀疏數組
		int sparseArr[][] = new int[sum + 1][3];
		// 給稀疏數組賦值
		sparseArr[0][0] = chessArr1.length;
		sparseArr[0][1] = chessArr1.length;
		sparseArr[0][2] = sum;

		// 遍歷二維數組,將非0的值存放到 sparseArr中
		int count = 0; // count 用於記錄是第幾個非0數據
		for (int i = 0; i < chessArr1.length; i++) {
			for (int j = 0; j < chessArr1.length; j++) {
				if (chessArr1[i][j] != 0) {
					count++;
					sparseArr[count][0] = i;
					sparseArr[count][1] = j;
					sparseArr[count][2] = chessArr1[i][j];
				}
			}
		}

		// 輸出稀疏數組的形式
		System.out.println();
		System.out.println("得到稀疏數組為～～～");
		for (int i = 0; i < sparseArr.length; i++) {
			System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);

		}
		System.out.println();

		// 將稀疏數組 --> 恢復成 二維數組
		/*
		 * 1. 先讀取稀疏數組的第一行, 根據第一行的數據, 創建原始的二維數組 chessArr2=int[11][11] 2. 在讀取稀疏數組後幾行的數據,
		 * 並賦給原始的二維數組 即可
		 */

		// 1. 先讀取稀疏數組的第一行, 根據第一行的數據, 創建原始的二維數組

		int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];

		// 2. 在讀取稀疏數組後幾行的數據(從第二行開始), 並賦給原始的二維數組 即可

		for (int i = 1; i < sparseArr.length; i++) {
			chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
		}

		// 輸出恢復後的二維數組
		System.out.println();
		System.out.println("恢復後的二維數組");
		for (int[] row : chessArr2) {
			for (int data : row) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
	}

}
