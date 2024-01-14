package in.co.rays.practice;

public class GetSet {
	int number;
	String acc_type;
	public void setNumber(int number)
	{
		this.number=number;
	}
	public int getNumber()
	{
		return number;
	}
	
	public void setAccType(String acc_type)
	{
		this.acc_type=acc_type;
	}
	public String getAccType()
	{
		return acc_type;
	}
	
public static void main(String[] args) {
	
GetSet gs=new GetSet();
gs.setNumber(1);
gs.setAccType("Savings");
gs.getAccType();
System.out.println(gs.getNumber());
System.out.println(gs.getAccType());
}
}
