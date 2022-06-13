package basic;

public class Staff extends Person{

	private String job;
	
	public Staff() {
		System.out.println("this is staff instance");
		
	}
	public void printJob() {
		System.out.println(name + " 직원의 업무는 " + job );
		
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
