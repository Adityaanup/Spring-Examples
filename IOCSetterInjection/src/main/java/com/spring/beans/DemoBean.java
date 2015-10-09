package com.spring.beans;

import java.util.Calendar;

public class DemoBean implements Demo {
	
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String generateWishMsg(String name) {
		Calendar cl= Calendar.getInstance();
		int h= cl.get(Calendar.HOUR_OF_DAY);
		
		if(h<=12){
			return msg+ " Good Morning " + name;
		}
		else if(h<=16){
			return msg+ " Good AfterNoon " + name;
		}
		else if(h<=20){
			return msg+ " Good Evening " + name;
		}
		else{
			return msg+ " Good Night " + name;
		}
	}


}
