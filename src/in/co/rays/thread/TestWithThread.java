package in.co.rays.thread;

public class TestWithThread {
	public static void main(String[] args) {
		WithThread t1=new WithThread("t1 run");
		WithThread t2=new WithThread("t2 start");
		WithThread t3=new WithThread("t3 run");
		for(int i=0;i<5;i++)
		{
			System.out.println("main ");
		}
		t1.run();
		t2.start();
		t3.run();
	}
}
