package constructor;

public class Bank {
	
	public static void main(String[] args) {
		BankAccount myBA = new BankAccount("Lee", 1267, 100000.0);
		System.out.println(myBA.getAccNum());
		
		BankAccount annoyBA = new BankAccount(1222, 100000000.0);
		System.out.println(annoyBA.getAccNum());
		
//		myBA.accNum; private 접근제한자는 외부에서 접근 불가능
	}
}
 