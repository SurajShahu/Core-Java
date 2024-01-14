package in.co.rays.polymorphism;

public class TestBusinessman {
public static void main(String[] args) {
	Businessman b=new Businessman();
	Richman r=new Businessman();
	r.earnMoney();
	b.party();
	r.donation();
}
}
