package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_selenium {

	public static void main(String[] args) {
		
		
		WebDriver driver1;
		WebDriver driver2;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amiddha\\Desktop\\Important_downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\amiddha\\Desktop\\Important_downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver2 = new FirefoxDriver();
		driver1.navigate().to("https://amazon.com");
		driver2.navigate().to("https://flipkart.com");
		
		
		
		
	
		
		
		

	}

}
