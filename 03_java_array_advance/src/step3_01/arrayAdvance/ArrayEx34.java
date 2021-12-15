package step3_01.arrayAdvance;

// 2차원 배열

public class ArrayEx34 {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][4];
		
		System.out.println("arr : " + arr);
		System.out.println("arr[0] : " +arr[0]);
		System.out.println("arr[1] : " +arr[1]);
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		
		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		arr[1][3] = 80;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] temp1 = arr;	// 주소
		int[] temp2   = arr[0];	// 주소
		int[] temp3   = arr[1]; // 주소
		
		int temp4 = arr[0][2];	// 값
		int temp5 = arr[1][1];	// 값
		
	}

}
