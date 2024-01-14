package in.co.rays.thread;

public class TestWithoutThread {
	public static void main(String[] args) {
		WithoutThread t1 = new WithoutThread("suraj");
		WithoutThread t2 = new WithoutThread("sahu");
		t1.run();
		t2.run();
	}

}
