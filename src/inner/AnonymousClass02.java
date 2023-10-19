package inner;

// 다른 모습
interface AC {
	public void print();

	public void method2();
}

class AD implements AC {
	@Override
	public void print() {
	}

	@Override
	public void method2() {
	}
}

public class AnonymousClass02 {
	public static void main(String[] args) {
		AC ad = new AD();
		ad.print();
		ad.method2();
		
		AC ac = new AC() {
			@Override
			public void print() {
			}

			@Override
			public void method2() {
			}
		};
		ac.print();
		ac.method2();
	}
}
