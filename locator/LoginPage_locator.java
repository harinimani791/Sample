package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class LoginPage_locator extends BaseClass{
	public static WebElement getUsername() {
		return driver.findElement(By.id("username"));	
	}
	
	public static WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement getlogin() {
		return driver.findElement(By.id("login"));
	}
}
