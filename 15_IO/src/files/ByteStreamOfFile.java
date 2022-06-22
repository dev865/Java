package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamOfFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		// 경로의 시작은 프로젝트 폴더
		final String PATH_OUT = "outFile.txt";
		final String PATH_IN = "inFile.txt";
	
		fos = new FileOutputStream(PATH_OUT);
		fis = new FileInputStream(PATH_IN);
		
		int n;
		
		try {
			while((n = fis.read()) != -1) {
				System.out.println(n);
				fos.write(n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(fis != null) {
			fis.close();
		}
		if(fos != null) {
			fos.close();
		}
	}
}
