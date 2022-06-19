
public class Threader extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
