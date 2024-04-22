
package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookHotel_Locator extends SelectHotel_locator{
	public static WebElement firstname() {
		return driver.findElement(By.id("first_name"));	
	}
	public static WebElement lastname() {
		return driver.findElement(By.id("last_name"));
	}
	public static WebElement address() {
		return driver.findElement(By.id("address"));	
	}
	public static WebElement card() {
		return driver.findElement(By.id("cc_num"));	
	}
	public static WebElement cardtype() {
		return driver.findElement(By.id("cc_type"));	
	}
	public static WebElement month() {
		return driver.findElement(By.id("cc_exp_month"));	
	}
	public static WebElement year() {
		return driver.findElement(By.id("cc_exp_year"));	
	}
	public static WebElement cvv() {
		return driver.findElement(By.id("cc_cvv"));	
	}
	public static WebElement book() {
		return driver.findElement(By.id("book_now"));
	}
}
