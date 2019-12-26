package test;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("src/main/webapp/img/upload/");
		File localFile = new File("src/main/webapp/img/upload/");
		f.mkdirs();
		System.out.println(localFile.getAbsolutePath());
		
	}

}
