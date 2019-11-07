package alt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class service {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHISHEK\\Desktop\\ddd\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

	}

}
