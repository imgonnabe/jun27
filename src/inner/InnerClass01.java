package inner;

// 중첩 클래스
class A{
	class B{}// 인스턴스 멤버 클래스
	static class C{}// 정적 멤버 클래스
	
	public void me1() {
		class B{}// 로컬 클래스		
	}
	
	public void me2() {
		class B{}
	}
	
}
public class InnerClass01 {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
	}
}
