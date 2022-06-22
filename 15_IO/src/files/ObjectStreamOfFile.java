package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class ObjectStreamOfFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		System.out.println("객체 만들기 시작");
		oos = new ObjectOutputStream(new FileOutputStream("obj.dat"));
		LocalDateTime now = LocalDateTime.now();
		System.out.println("객체 생성 시간 : " + now.toString());
		oos.writeObject(LocalDateTime.now());
		oos.flush();
		System.out.println("객체를 만들기 완료");
		
		System.out.println("객체 읽기 시작");
		ois = new ObjectInputStream(new FileInputStream("obj.dat"));
		System.out.println(ois.readObject());
		System.out.println("객체 확인 시간: " + LocalDateTime.now());
		System.out.println("객체 출력 완료");
		
		if(oos != null) {
			oos.close();
		}
		if(ois != null) {
			ois.close();
		}
	}
}
