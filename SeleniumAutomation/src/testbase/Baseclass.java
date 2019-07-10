package testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Baseclass {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MavenAutomation\\src\\main\\java\\config\\config.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String u=pro.getProperty("browser");
		System.out.println(u);
	}
}
