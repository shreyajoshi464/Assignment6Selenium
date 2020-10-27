package Top;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvide {
	WebDriver dr;
	String url="https://www.google.co.in";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	
		@Test(dataProvider = "details")
		public void f(String keyword) {

			

			System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.get(url);
			dr.manage().window().maximize();

			dr.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(keyword);

			System.out.println("Data is send to google:- " + keyword);

		}

		@DataProvider(name = "details")
		public Object[][] details() {
			Object[][] data=new Object[3][1];
	       		data[0][0]="JAVA";
	        	data[1][0]="C";
	        	data[2][0]="SELENIUM";

			return data;
		}
	
		
	}


