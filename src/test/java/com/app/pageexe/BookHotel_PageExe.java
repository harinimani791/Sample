package com.app.pageexe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;
import com.app.locator.BookHotel_Locator;


public class BookHotel_PageExe extends SelectHotel_PageExe {
	public static void firstName() {
	inputValue(firstname(), prop_reuse("FirstName"));
	}
	public static void lastName() {
	inputValue(lastname(), prop_reuse("LastName"));
	}
	public static void address1() {
	inputValue(address(), prop_reuse("Address"));
	}
	public static void card1() {
	inputValue(card(), prop_reuse("CardNumber"));
	}
	public static void cardType() {
	BaseClass.dropdown(BookHotel_Locator.cardtype(), BaseClass.prop_reuse("CardType"));
	}
	public static void month1() {
	BaseClass.dropdown(BookHotel_Locator.month(), BaseClass.prop_reuse("Month"));
	}
	public static void year1() {
	BaseClass.dropdown(BookHotel_Locator.year(), BaseClass.prop_reuse("Year"));
	}
	public static void cvv1() {
	BaseClass.inputValue(BookHotel_Locator.cvv(), BaseClass.prop_reuse("Cvv"));
	}
	public static void booking() {
	BaseClass.clickValue(BookHotel_Locator.book());
	}
}
