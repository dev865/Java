package basic;

public class RelationMain {
	
	public static void main(String[] args) {
		Person p = new Person();
		Student std = new Student();
		std.setTelNum(12345678);
		std.setName("Lee");
		std.setDept("IT");
		std.setAddr("Seoul");
		std.setSubjects(new String[]{"HTML","CSS","JS","JAVA"});
		std.printInfo();
		std.printSubjects();
		System.out.println("-------------------------------");
		
		Professor pf = new Professor();
		pf.setTelNum(3251296);
		pf.setName("이교수");
		pf.setAddr("강남구");
		pf.setDept("미용학부");
		
		Person newbee = new Student();
	}
}
