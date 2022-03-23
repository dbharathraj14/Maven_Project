package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Home_Page;
import com.pom.Login_Page;


public class Page_Object_Manager {
	
	public WebDriver driver;
	// private ClassName object
	private Home_Page hp; //null
	private Login_Page lp;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver= driver2;
	}


	public Home_Page get_instance_hp(){
		
		if (hp==null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}
	
	public Login_Page get_instance_lp(){
		
		if(lp==null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}
	
	
	
	
	
	
	
	
	

}
