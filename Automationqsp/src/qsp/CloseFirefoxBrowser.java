package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefoxBrowser {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		new FirefoxDriver().close();
		// TODO Auto-generated method stub

	}

}
