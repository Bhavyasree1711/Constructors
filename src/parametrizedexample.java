class Vehicle{
	
	private String color;
	private String Company;
	private int year;
	private int cost;
	Vehicle(String a,String b,int c, int d){
		color = a;
		Company = b;
		year = c;
		cost = d;
		
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
public class parametrizedexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Blue","BMW",2025,2500);
		System.out.println(v.getColor());
		System.out.println(v.getCompany());
		System.out.println(v.getYear());

		System.out.println(v.getCost());
	}

}
