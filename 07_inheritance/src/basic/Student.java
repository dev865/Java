package basic;

public class Student extends Person {
	private String[] subjects;

	public Student() {
		super();
		System.out.println("this is student instance");
	}
	public void printSubjects() {
		System.out.println("학생의 수강과목 리스트");
		for (String sub : subjects) {
			System.out.println("수강과목 : " + sub);
			
		}
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	

}
