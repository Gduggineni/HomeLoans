package com.homeloans.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.homeloans.helpermethods.DriverFactory;

public class HelloWorld {

	private static String baseUrl = "http://demo.guru99.com/test/newtours/";
	private static String expectedTitle = "Welcome: Mercury Tours";
	private static String actualTitle = "";
	private static WebDriver webdriver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		webdriver = DriverFactory.driverOpen();

		lanchBrowser();
		compareTitle();

		webdriver.close();
		System.out.println("Close the browser");
	}

	public static void compareTitle() {

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Titles are same!");
		} else {
			System.out.println("Titles mismatch");
		}
	}

	public static void lanchBrowser() {

		webdriver.get(baseUrl);
		System.out.println("Launch the chrome browser");

		actualTitle = webdriver.getTitle();

		System.out.println(actualTitle);

	}

}
