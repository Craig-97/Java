package inheritance01;

public abstract class Person {
	String name;
	int age;
	
	public abstract String favouriteDrink();
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	

}
