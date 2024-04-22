package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectHotel_locator extends SearchHotel_locator{
	public static WebElement radio() {
		return driver.findElement(By.id("radiobutton_0"));	
	}
	public static WebElement continue1() {
		return driver.findElement(By.id("continue"));	
	}
}
