class Dog{
	

	private String name;
	private String Color;
	private int age;
	private String breed;
	 
	Dog(){
		name = "Tommy";
		Color = "Black";
		age = 3;
		breed = "Lab";
	}
	public String getName() {
		return name;
	}

	public String getColor() {
		return Color;
	}

	public int getAge() {
		return age;
	}

	public String getBreed() {
		return breed;
	}
}
public class Zeroparametrized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getColor());
		System.out.println(d.getBreed());
		
	}

}
