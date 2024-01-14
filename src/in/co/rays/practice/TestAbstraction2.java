package in.co.rays.practice;

 abstract class Bike{
	Bike()
	{
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("gear changed");
	}
}
class Honda extends Bike{

	@Override
	void run() {
		System.out.println("running safely..");
	}
	
}
class TestAbstraction2{
	public static void main(String[] args) {
		Bike h1=new Honda();
		h1.run();
		h1.changeGear();
	}
}
