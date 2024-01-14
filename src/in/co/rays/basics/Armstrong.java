package in.co.rays.basics;

public class Armstrong {

	public static void main(String args[]) {
		int num = 153;
		int sum = 0;
		int r;
		int n = num;
		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (sum == num) {
			System.out.println("Yes armstrong number");
		} else {
			System.out.println("Not an armstrong number");

		}

	}
}
