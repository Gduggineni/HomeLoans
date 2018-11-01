package com.homeloans.helpermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver webdriver;

	public static WebDriver driverOpen() {

		if (webdriver == null) {

			System.setProperty("webdriver.chrome.driver", "C:/Gopi_Softwares/chromedriver_win32/chromedriver.exe");
			webdriver = new ChromeDriver();

		}
		return webdriver;
	}
}
