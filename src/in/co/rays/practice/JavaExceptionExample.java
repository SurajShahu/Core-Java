package in.co.rays.practice;

public class JavaExceptionExample {
	static int a;
	public static void main(String[] args) {
		try {
			int data = 100 / 0;//code that may raise exception
			a=data;
		} catch (ArithmeticException e) {
				System.out.println(e);
		}
		//rest code of the program
		System.out.println("rest code of the program "+a);

	}
}
