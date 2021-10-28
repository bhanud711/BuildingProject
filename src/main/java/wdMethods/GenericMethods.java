package wdMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethods {
	public static WebDriver driver;
	
	public void start()
	{
		try {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Title of the webpage"+driver.getTitle());
		System.out.println("Url of the webapplication"+driver.getCurrentUrl());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void type(WebElement ele,String data)
	{
		try {
		ele.clear();
		ele.sendKeys(data);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void button(WebElement ele)
	{
		ele.click();
	}
	
	public void closeOneBrowser()
	{
		driver.close();
	}
	
	public void closeAllBrowsers()
	{
		driver.quit();
	}

}
