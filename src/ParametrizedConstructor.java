class dog{
	
	private String name;
	private String Color;
	private int age;
	private String breed;

dog(String a,String b,int c,String d){
	name = a;
	Color = b;
	age = c;
	breed = d;
	
	
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
public class ParametrizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog("tommy","white",3,"lab");
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getColor());
		System.out.println(d.getBreed());
		
		

	}

}
