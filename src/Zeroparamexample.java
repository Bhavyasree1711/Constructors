class Vehi{
	
	private String color;
	private String Company;
	private int year;
	private int cost;
	Vehi(){
		color = "Blue";
		Company = "BMW";
		year = 2025;
		cost = 50000;
}
	public String getColor() {
		return color;
	}
	public String getCompany() {
		return Company;
	}
	public int getYear() {
		return year;
	}
	public int getCost() {
		return cost;
	}
}
public class Zeroparamexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehi v = new Vehi();
		System.out.println(v.getColor());
		System.out.println(v.getCompany());
		System.out.println(v.getYear());

		System.out.println(v.getCost());

	}
}


