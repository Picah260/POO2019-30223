
public class Test {
	public static void f() throws MyException2 {
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace();
			throw new MyException2("MyException2");
		}

	}

	public static void g() throws MyException {
		throw new MyException("MyException");

	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException2 e) {
			e.printStackTrace();
		}

	}

}
