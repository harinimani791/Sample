package com.app.exe;

import com.app.pageexe.BookHotel_PageExe;

public class Exe extends BookHotel_PageExe{

	public static void main(String[] args) {
		browserlaunch("https://adactinhotelapp.com/");
		username();
		password();
		click();
		location();
		hotels();
		roomType();
		numberOfRoom();
		checkIn();
		checkOut();
		adults();
		children();
		searching();
		radios();
		continues();
		firstName();
		lastName();
		address1();
		card1();
		cardType();
		month1();
		year1();
		cvv1();
		booking();
	}

}
