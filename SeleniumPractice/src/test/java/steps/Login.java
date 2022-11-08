package steps;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.browserpage.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilies.ExcelUtilies;

import static java.time.Duration.*;

public class Login {

	WebDriver driver;
	HomePage homePage;
	ExcelUtilies excelUtilies;
	String username;
		String password;
		@BeforeTest
		public void setUp() {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
			homePage = new HomePage(driver);
			driver.manage().timeouts().implicitlyWait(ofMinutes(2));
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			String path = System.getProperty("user.dir")+"/ExcelData/Data.xlsx";
			excelUtilies = new ExcelUtilies(path, "Information");

		}

		@Test(priority = 1)
		public void clickSignIn() throws InterruptedException {
		homePage.clickHomeSignIn();

		}

		@Test(priority = 2)
		public void enterLoginInformation(){
			homePage.enterEmailAddressLogin(excelUtilies.getStringCellData(2,1));
			homePage.enterPasswordLogin(excelUtilies.getStringCellData(2,2));
			homePage.clickSignButton();
		}

		@Test(priority = 3)
		public void clickLogIn(){
			homePage.clickSignButton();
		}





	@AfterTest
	public void AfterClass() {
		driver.close();
	}


}
