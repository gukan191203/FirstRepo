import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium softwares\\chromedriver-win64_v117\\chromedriver-win64\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
