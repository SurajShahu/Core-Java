package in.co.rays.thread;

public class ThreadSleep extends Thread {
	String name="null";
	int i=1;
	public ThreadSleep(String name)
	{
		this.name=name;
	}
	@Override
	public void run() {
			while(true)
			{
				try {
					Thread.sleep(600);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(i+" "+name);
				i++;
			}
	}
}
