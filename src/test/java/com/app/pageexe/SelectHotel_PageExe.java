package com.app.pageexe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;
import com.app.locator.*;

public class SelectHotel_PageExe extends SearchHotel_PageExe{
	public static void radios() {
	BaseClass.clickValue(SelectHotel_locator.radio());
	}
	public static void continues() {
	BaseClass.clickValue(SelectHotel_locator.continue1());
	}
}
