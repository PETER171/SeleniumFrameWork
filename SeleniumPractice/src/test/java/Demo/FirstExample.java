package Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.browserpage.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstExample {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);

		//driver.manage().timeouts().implicitlyWait();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void test1() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		Thread.sleep(10000);
		homePage.clickHTMLElement();
		Thread.sleep(5000);
		driver.findElement(By.id("navbtn_tutorials")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='w3-col l3 m6']//a[contains(text(),'Learn HTML')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='leftmenuinnerinner']//a[contains(text(),'HTML Forms')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='w3-example']//a[contains(text(),'Try it Yourself')])[1]")).click();



	}

	@AfterTest
	public void AfterClass() {
		driver.close();
	}


}
