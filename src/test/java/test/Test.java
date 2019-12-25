package test;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("../upload");
		f.mkdirs();
		System.out.println(f.getAbsolutePath());
	}

}
