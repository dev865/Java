
public class ThreadEx2 {
	static long startTime = 0L;
	public static void main(String[] args) {
		// 만약 정확하게 싱크를 맞추고싶으면 싱크로나이즈드 기법을배움
		// 웹에서는 쓸일이거의 없어서 추후에 배울것
		ThreaderA tha = new ThreaderA();
		ThreaderB thb = new ThreaderB();
		
		tha.start();
		thb.start();
		startTime = System.currentTimeMillis();
		
		try {
			tha.join();
			thb.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis() - ThreadEx2.startTime);
		
	}
}
