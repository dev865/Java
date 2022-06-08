package quiz;

public class Quiz9 {
	//4. 아래의 조건을 참고 및 추리하여 코드를 작성해보세요.
	//	a. Student 클래스 생성
	//	b. 학생 이름,반,번호,국어점수,영어점수,수학점수 변수 생성 
	//	c. getTotal메서드(점수총점)반환
	//	d. getAvg메서드(평점)반환
	public static void main(String[] args) {
		Student lee = new Student();
		lee.name = "Lee";
		lee.classRoom = 12;
		lee.num = 8;
		lee.koreanScore = 85.9;
		lee.mathScore = 90.2;
		lee.englishScore = 77.4;
		double totalScore = lee.getTotal();
		
		System.out.println(lee.name + "의 총점은: " + lee.getTotal());
		System.out.println(lee.name + "의 평균점수는 : " + lee.getAvg(totalScore));
	}
}

class Student{
	String name;
	int classRoom;
	int num;
	double koreanScore;
	double mathScore;
	double englishScore;
	
	public double getTotal(){
		return (koreanScore + mathScore + englishScore);
	}
	public double getAvg(double totalScore) {
		return (totalScore/3);
	}
}