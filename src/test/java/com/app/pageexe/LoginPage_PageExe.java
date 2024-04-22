package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.BookHotel_Locator;
import com.app.locator.LoginPage_locator;

public class LoginPage_PageExe extends BookHotel_Locator{
	public static void username() {
	BaseClass.inputValue(LoginPage_locator.getUsername(), BaseClass.prop_reuse("Username"));
	}
	public static void password() {
	BaseClass.inputValue(LoginPage_locator.getPassword(), BaseClass.prop_reuse("Password"));
	}
	public static void click() {
	BaseClass.clickValue(LoginPage_locator.getlogin());
	}
}
