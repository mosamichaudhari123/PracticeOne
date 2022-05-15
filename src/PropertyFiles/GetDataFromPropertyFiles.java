package PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertyFiles {

	
	public static void main(String[] args) throws IOException {
		String filepath = "B:\\Accereration\\Automation Testing\\Softwares\\Workspace\\PropertyFiles\\TestAppData\\TestData.properties";
		
//		String FilePath2 = ".\\TestAppData\\TestData.properties";
//		
//		String FilePath3 = System.getProperty("user.dir")+"\\\\TestAppData\\\\TestData.properties";
		
		FileInputStream f1 = new FileInputStream(filepath);
		
		Properties p1 = new Properties();
		p1.load(f1);
		
		System.out.println("Application Url: "+p1.getProperty("appUrl"));
		System.out.println("username: "+p1.getProperty("username"));
		System.out.println("password: "+p1.getProperty("password"));
		System.out.println("conformPassword: "+p1.getProperty("conformPassword "));
		System.out.println("firstName: "+p1.getProperty("firstName"));
		System.out.println("lastName: "+p1.getProperty("lastName"));
		System.out.println("contactNumber: "+p1.getProperty("contactNumber"));
		System.out.println("emailid: "+p1.getProperty("emailid"));
	
	}

}
