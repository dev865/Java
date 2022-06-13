package practice.practice_case1;

public class Inventory {
	private Picachu picachu;
	private Kobuggi kobuggi;
	private LeeSangHae leeSangHae;
	private PyLee pyLee;
	private Character ch;
	
	public Character choiceCharacter(int chNum) {
		switch (chNum) {
		case 1:
			if(picachu == null) {
				picachu = new Picachu();
			}
			ch = picachu;
			break;
		case 2:
			if(kobuggi == null) {
				kobuggi = new Kobuggi();
			}
			ch = kobuggi;
			break;
		case 3:
			if(leeSangHae == null) {
				leeSangHae = new LeeSangHae();
			}
			ch = leeSangHae;
			break;
		case 4:
			if(pyLee == null) {
				pyLee = new PyLee();
			}
			ch = pyLee;
			break;

		default:
			System.out.println("캐릭터를 잘못 선택하셨습니다");
			return null;
		}
		return ch;
	}
}
