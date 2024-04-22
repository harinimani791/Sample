package com.app.pageexe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;
import com.app.locator.SearchHotel_locator;

public class SearchHotel_PageExe extends LoginPage_PageExe{
	public static void location() {
	BaseClass.dropdown(SearchHotel_locator.getLocation(), BaseClass.prop_reuse("Location"));
	}
	public static void hotels() {
	BaseClass.dropdown(SearchHotel_locator.getHotels(), BaseClass.prop_reuse("Hotels"));
	}
	public static void roomType() {
	BaseClass.dropdown(SearchHotel_locator.getRoomType(), BaseClass.prop_reuse("Roomtype"));
	}
	public static void numberOfRoom() {
	BaseClass.dropdown(SearchHotel_locator.getNumberofRooms(), BaseClass.prop_reuse("No.ofrooms"));
	}
	public static void checkIn() {
	BaseClass.inputValue(SearchHotel_locator.getCheckInDate(), BaseClass.prop_reuse("CheckInDate"));
	}
	public static void checkOut() {
	BaseClass.inputValue(SearchHotel_locator.getCheckOutDate(), BaseClass.prop_reuse("CheckOutDate"));
	}
	public static void adults() {
	BaseClass.dropdown(SearchHotel_locator.getAdultsPerRoom(), BaseClass.prop_reuse("AdultRoom"));
	}
	public static void children() {
	BaseClass.dropdown(SearchHotel_locator.getChildrenPerRoom(), BaseClass.prop_reuse("ChildrenRoom"));
	}
	public static void searching(){
	BaseClass.clickValue(SearchHotel_locator.search());
	}
}
