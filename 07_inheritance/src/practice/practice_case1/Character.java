package practice.practice_case1;

public abstract class Character {
	protected int hp;
	protected int mp;
	protected int level;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract void play();
	public abstract boolean train();
	public abstract void levelUp();
	
	public boolean checkMP() {
		return mp <= 0 ? true : false;
				
	}
	public void printStatus() {
		System.out.println("현재 캐릭터의 상태....");
		System.out.println("HP : " + hp);
		System.out.println("MP : " + mp);
		System.out.println("Level : " + level);
	}
}
