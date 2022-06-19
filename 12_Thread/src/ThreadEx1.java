
public class ThreadEx1 {

	public static void main(String[] args) {
		Threader t1 = new Threader();
		Runnable t2 = new Threadable();
		Thread t3 = new Thread(t2);
		t1.start();
		t3.start();
	}
}
