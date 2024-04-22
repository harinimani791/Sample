package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotel_locator extends LoginPage_locator{
	public static WebElement getLocation() {
		return driver.findElement(By.id("location"));
	}
	public static WebElement getHotels() {
		return driver.findElement(By.id("hotels"));
	}
	public static WebElement getRoomType() {
		return driver.findElement(By.id("room_type"));
	}
	public static WebElement getNumberofRooms() {
		return driver.findElement(By.id("room_nos"));
	}
	public static WebElement getCheckInDate() {
		return driver.findElement(By.id("datepick_in"));
	}
	public static WebElement getCheckOutDate() {
		return driver.findElement(By.id("datepick_out"));
	}
	public static WebElement getAdultsPerRoom() {
		return driver.findElement(By.id("adult_room"));
	}
	public static WebElement getChildrenPerRoom() {
		return driver.findElement(By.id("child_room"));
	}
	public static WebElement search() {
		return driver.findElement(By.id("Submit"));	
	}
}
