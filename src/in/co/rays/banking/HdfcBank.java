package in.co.rays.banking;

public class HdfcBank extends Bank {
	private double interetRate;
	private String name;

	public HdfcBank(double interetRate,String name)
	{
		this.interetRate=interetRate;
		this.name=name;
	}
	
	public double getInteretRate() {
		return interetRate;
	}

	public void setInteretRate(double interetRate) {
		this.interetRate = interetRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
