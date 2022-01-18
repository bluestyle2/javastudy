package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DataOutMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fff/eee.abc");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(false);
		dos.writeInt(123);
		dos.writeDouble(123.456);
		dos.writeUTF("안녕하세요");
		
		dos.close();
		fos.close();

	}

}
