package files;

import java.io.File;
import java.util.StringTokenizer;

public class FileObject {

	public static void main(String[] args) {
		File f = new File("/Users/fez/Desktop/lec/_core/15_IO");
		
		String fileName = f.getName();
		System.out.println("경로를 제외한 파일 이름 : " + fileName);
		System.out.println("경로를 포함한 파일 이름 : " + f.getAbsolutePath());
		System.out.println("경로를 포함한 파일 이름 : " + f.getPath());
		System.out.println("파일이 속한 폴더 : " + f.getParent());
		System.out.println("--------------------------");
//		System.out.println("파일 경로 구분자 : " + File.pathSeparator);		
//		System.out.println("파일 경로 구분문자 : " + File.pathSeparatorChar);
		System.out.println("파일 구분자 : " + File.separator);		// 자주 사용
		System.out.println("파일 구분 문자 : " + File.separatorChar);
		System.out.println("==============================");
		// fileName에서 파일의 순수이름과 확장자를 구별해 보세
		
		System.out.println("==============================");
		System.out.println("사용자 폴더 : " + System.getProperty("user.dir"));
		System.out.println("자바시작경로 : " + System.getProperty("sun.boot.class.path"));
		
 
	}
}
