package inner;

// 정적 멤버 클래스
/*
 * static 키워드로 선언된 클래스
 */

class SA{
	static class SB{
		public SB() {}// 생성자
		int num;
		static int number;// 정적 멤버
		void me1() {}
		static void me2() {}// 정적 메소드
		
	}
}
public class StaticClass01 {
	public static void main(String[] args) {
		SA.SB sb = new SA.SB();
		sb.num = 10;
		sb.me1();
		
		SA.SB.number = 1;
		SA.SB.me2();
	}
}
