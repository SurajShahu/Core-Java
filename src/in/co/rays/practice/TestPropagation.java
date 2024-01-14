package in.co.rays.practice;

public class TestPropagation  {
	public static void main(String[] args) throws MyException{
		ccc();
	}

	private static void ccc() {
		bbb();
	}

	private static void bbb()  {
		aaa();
	}

	private static void aaa()  {
		try {
			throw new MyException();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
