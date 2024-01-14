package in.co.rays.thread;

public class TestThreadSleep {
	public static void main(String[] args) {
		ThreadSleep t1=new ThreadSleep("Parent");
		t1.setDaemon(true);
		t1.start();
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(200);
			} catch (Exception e) {
					e.printStackTrace();
			}
			System.out.println(i+"main ");
		}
	}
}
