package practice_case1;

public class PyLee extends Character {

	public PyLee() {
		hp = 100;
		mp = 100;
		System.out.println("파이리 파이리~~");
		printStatus();
	}

	@Override
	public void eat() {
		mp+=10;
		
	}

	@Override
	public void sleep() {
		mp+=20;
		
	}

	@Override
	public void play() {
		mp-=20;
		hp+= 5;
	}

	@Override
	public boolean train() {
		mp-=10;
		hp+=10;
		levelUp();
		return checkMP();
	}

	@Override
	public void levelUp() {
		if(hp >= 40) {
			hp -= 40;
			level++;
		}
		
	}
}
