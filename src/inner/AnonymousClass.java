package inner;

// 익명 클래스
/*
 * 이름이 없는 객체
 * 클래스의 이름이 없는 클래스. 선언과 인스턴스를 동시에 하는 클래스
 * 클래스를 인수의 값으로 사용하는 클래스
 * 객체를 한번만 사용할 수 있는 클래스
 * 클래스의 선언부가 없기 때문에 생성자가 없다.
 * 슈퍼 클래스의 이름이나 구현할 인터페이스의 이름을 사용해서 정의한다.
 * 오직 하나의 클래스를 상속받거나 하나의 인터페이스만 구현 가능하다.
 * 
 * 코드블럭을 클래스 선언에 하는 점만 제외하고 생성자 호출과 동일하다.
 * 객체를 구성하는 new 문장 뒤에 클래스의 {}블록을 첨부하여 몸통을 닫는 형식으로 구성된다.
 * 
 * new 슈퍼 클래스 또는 인터페이스명(){};
 * 
 * 객체를 생성한 후에 {}; 즉, 메소드를 구현한 블록이 있고 블록 끝에는 세미콜론을 붙인다.
 * new 뒤에 오는 생성자명이 기존 클래스명이며 익명클래스가 자동으로 호출한 클래스의 하위 클래스가 된다.
 * 
 * 인터페이스인 경우에는 인터페이스를 상속하는 부모 클래스가 Object가 된다.
 */
class AA{
	public void method() {
		System.out.println("AA's method()");
	}
}

class AB extends AA{
	@Override
	public void method() {
		System.out.println("자식에서 재정의");
	}
}
public class AnonymousClass {
	public static void main(String[] args) {
		AA aa = new AA() {
			@Override
			public void method() {
				System.out.println("익명 객체입니다.");
			}
		};// 생성자 끝
		aa.method();
		
		AA aaa = new AB();
		aaa.method();
		
	}
}
