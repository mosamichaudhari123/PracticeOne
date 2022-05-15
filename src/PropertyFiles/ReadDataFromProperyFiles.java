package PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperyFiles {

	public static void main(String[] args) throws IOException {
		String CurrentWorkingDir = System.getProperty("user.dir");
		
		String filepath = CurrentWorkingDir+"\\TestAppData\\Data.properties";
		FileInputStream f1=new FileInputStream("B:\\Accereration\\Automation Testing\\Softwares\\Workspace\\PropertyFiles\\TestAppData\\Data.properties");
	
	//	FileInputStream f1 = new FileInputStream(".\\TestAppData\\Data.properties");
		Properties p1 = new Properties();
		p1.load(f1);
		
		System.out.println(p1.getProperty("appUrl "));
		System.out.println(p1.getProperty("mosami "));
		System.out.println(p1.getProperty("chaudhari"));
		System.out.println(p1.getProperty("pincode"));
		
	}
}
