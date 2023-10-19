package jun27;

import java.util.Scanner;

class Cat {
	int input;

	public int run() {
		// 1~5 무작위 숫자
		input = (int) (Math.random() * 5) + 1;
		return input;
	}

	public int run2() {
		// 인접 숫자로 이동 1 > 2, 5 > 4
		if (input == 1) {
			input = 2;
		} else if (input == 5) {
			input = 4;
		} else {
			int coinFlip = (int) (Math.random() * 2); // 0 또는 1 반환
			if (coinFlip == 0) {
				input -= 1;
			} else {
				input += 1;
			}
		}
		return input;
	}

}

public class MS {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.run();
		System.out.println("번호: " + cat.input);
		
		boolean ch = true;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		while(ch) {
			System.out.println("입력하세요.");
			int a = sc.nextInt();
			
			if(cat.input == a) {
				System.out.println(i + "번째 만에 잡았습니다.");
				break;
			} else {
				cat.run2();
				System.out.println("번호: " + cat.input);
			}
			i++;
		}
	}
}
