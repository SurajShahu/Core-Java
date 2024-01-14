package in.co.rays.practice;

public class Businessman implements Richman,SocialWorker {

	public void earnMoney() {
		System.out.println("crorepati");

	}

	public void party() {
		System.out.println("party ho rahi hai");

	}

	public void donation() {
		System.out.println("Accha banda");
	}

	@Override
	public void helpToOthers() {
		System.out.println("Helping others good work");
		
	}

}
