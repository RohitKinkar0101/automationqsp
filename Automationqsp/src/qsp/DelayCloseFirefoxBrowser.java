package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DelayCloseFirefoxBrowser {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver= new FirefoxDriver();
		Thread.sleep(10000);
		driver.close();
		// TODO Auto-generated method stub

	}

}
