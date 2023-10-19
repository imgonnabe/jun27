package jun27;

import java.util.Scanner;

public class NetHack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();

		String[][] arr = new String[input1][input2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
					arr[i][j] = "*";
				} else {
					arr[i][j] = " ";
				}
			}
		}

		for (int i1 = 0; i1 < arr.length; i1++) {
			for (int j1 = 0; j1 < arr[i1].length; j1++) {
				System.out.print(arr[i1][j1]);
			}
			System.out.println();
		}

		int i = 0;
		int j = 0;
		boolean ch = false;

		do {
			int coinFlip = (int) (Math.random() * 2); // 0 또는 1 반환
			if (coinFlip == 0) {
				i = 0;
				j = (int) (Math.random() * input2);
				
				if (j == 0 || j == input2 - 1) {
					System.out.println("다시");
					ch = true;
				}
			} else {
				i = (int) (Math.random() * input1);
				j = 0;
				
				if (i == 0 || i == input1 - 1) {
					System.out.println("다시");
					ch = true;
				} 
			}
		} while (ch);
		arr[i][j] = " ";

		for (int i1 = 0; i1 < arr.length; i1++) {
			for (int j1 = 0; j1 < arr[i1].length; j1++) {
				System.out.print(arr[i1][j1]);
			}
			System.out.println();
		}

	}
}
