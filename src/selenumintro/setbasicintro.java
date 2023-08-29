package selenumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setbasicintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step1. need to create object for  our prefreed browser driver class Eg: ChromeDriver,FirefoxDriver 
				//Webdriver is a interface , 
				//its master for Browser class , based on the methods in Interface it has implementation 
				//in Browser class 
				// if create obj for ChromeDriver class you able to use only methods in ChromeDriver Class , 
				//ChromeDriver driver = new ChromeDriver();
				
				//To communicate with webdriver methods, need a interperter class chromeDriver.exec file , download kept in local
				//through this only your broswer will commincate 
				// 
				
//				System.setPropert("webdriver.chrome.driver","C:\\Users\\SV58TR744\\Documents\\driverexe\\chromedriver.exe");
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SV58TR744\\Documents\\webdriver\\chromedriver.exe");       
				//WebDriver Interface methods and Class methods (Browser class methods) use below step. 
				//If you create obj for class and assign it to interface(WebDriver) instance(obj),you able to use WebDriver&BrowserClass methods
		       WebDriver driver = new ChromeDriver();
	}

}
