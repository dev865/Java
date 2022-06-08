package quiz.hotel;

public class User {
	private String name;
	private int age;
	private char gen;	

	public User() {
		
	}
	public User(String name, int age, char gen) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen; 
	}
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}	
}
