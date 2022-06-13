package practice_case2;

public class Inventory {
	private Picachu picachu;
	private Kobbugi kobbugi;
	private LeeSangHae leeSangHae;
	private PyLee pyLee;
	private Character ch;
	
	public Character choiceCharacter(int chNum) {
		
		switch (chNum) {
		case 1:
			if (picachu == null) {
				picachu = new Picachu();
			}
			ch = picachu;
			break;
		case 2:
			if (kobbugi == null) {
				kobbugi = new Kobbugi();
			}
			ch = kobbugi;
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
			System.out.println("캐릭터를 잘 못 선택하셨습니다.");
			return null;
		}
		return ch;
	}
}
