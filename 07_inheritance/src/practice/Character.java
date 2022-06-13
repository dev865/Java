package practice_case1;

public abstract class Character {
	protected int hp; // 체력
	protected int mp; // 마나
	protected int level; // 레벨
	
	// 플레이를 위한 추상클래스
	public abstract void eat(); 
	public abstract void sleep();
	public abstract void play();
	public abstract boolean train();
	public abstract void levelUp();
	
	// 마나 사용 조건 체크
	public boolean checkMp() {
		return mp <= 0 ? true : false; 
	}
	// 캐릭터 상태 출력 메서드
	public void printStatus() {
		System.out.println("현재 캐릭터의 상태....");
		System.out.println("HP : " +  hp);
		System.out.println("MP : " +  mp);
		System.out.println("Level : " +  level);
	}
}
