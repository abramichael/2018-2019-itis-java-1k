import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Arrays;

public class CopyFile {
	public static void genBinaryFile(String filename, byte [] bytes) throws IOException {
		
		FileOutputStream fos = new FileOutputStream(filename);
		fos.write(bytes);
		fos.close();
	}

	public static void copyFile(String src, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		while (fis.available() != 0) {
			fos.write(fis.read());
		}
		fis.close();
		fos.close();
	}
	
	public static byte [] readBytes(String filename, int len) throws IOException {
		byte [] bytes = new byte[len];
		FileInputStream fis = new FileInputStream(filename);
		int k = fis.read(bytes);
		if (k != len) {
			throw new ArrayIndexOutOfBoundsException("Not the same number");
		}
		return bytes;
	}
	
	public static void main(String [] args) throws IOException {	
	
		byte [] bytes = {1,2,3,4,6,5,7,8,9,10,11,12};
		genBinaryFile("array.dat", bytes);
		copyFile("array.dat", "array2.dat");
		byte [] newBytes = readBytes("array2.dat", bytes.length);
		System.out.println(Arrays.equals(bytes, newBytes));
		
	}
	
}