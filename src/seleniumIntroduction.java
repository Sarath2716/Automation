import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64 (1)\\chromedriver-win64");
		driver.get("https://www.rahulshettyacademy.com");
	    driver.getTitle();
		
	}

}
