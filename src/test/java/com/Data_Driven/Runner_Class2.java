package com.Data_Driven;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import com.helper.Page_Object_Manager;
import com.pom.Base_Class2;
public class Runner_Class2 extends Base_Class2 {
	public static WebDriver driver=BrowserConfig("chrome"); 
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static String path ="C:\\Users\\dzbha\\eclipse-workspace\\Maven_New\\target\\Test Case- Automation Practice.xlsx";
	public static String ScPath = "C:\\Users\\dzbha\\eclipse-workspace\\Selenium_New\\Driver\\Screenshot\\";
	public static void main(String[] args) throws Throwable {
        getUrl("http://automationpractice.com/");
		ClickOnElement(pom.get_instance_hp().getSigninBtn());
		inputValueElement(pom.get_instance_lp().getEmail(),get_Particular_CellData(path, 0,2,5));
		ClickOnElement(pom.get_instance_lp().getLogin());
		Wait_Time(1, TimeUnit.MINUTES);
		ClickOnElement(pom.get_instance_lp().getTitle());
		inputValueElement(pom.get_instance_lp().getFirstname(),get_Particular_CellData(path, 0,5,5));
		inputValueElement(pom.get_instance_lp().getLastname(), get_Particular_CellData(path, 0,6,5));
		inputValueElement(pom.get_instance_lp().getPaswd(),get_Particular_CellData(path, 0,7,5));
		Dropdown("Days", pom.get_instance_lp().getDays(),get_Particular_CellData(path, 1, 0, 0));
		Dropdown("months", pom.get_instance_lp().getMonths(),get_Particular_CellData(path, 1, 0, 1));
		Dropdown("Year", pom.get_instance_lp().getYears(),get_Particular_CellData(path, 1, 0, 2));
		ClickOnElement(pom.get_instance_lp().getCb1());
		ClickOnElement(pom.get_instance_lp().getCb2());
		inputValueElement(pom.get_instance_lp().getComp(),get_Particular_CellData(path, 0, 15, 5));
		inputValueElement(pom.get_instance_lp().getAdds(), get_Particular_CellData(path, 0, 16, 5));
	    inputValueElement(pom.get_instance_lp().getCity(), get_Particular_CellData(path, 0, 17, 5));
		inputValueElement(pom.get_instance_lp().getState(),get_Particular_CellData(path, 0, 18, 5));
		inputValueElement(pom.get_instance_lp().getPstc(),get_Particular_CellData(path, 0, 19, 5));
		inputValueElement(pom.get_instance_lp().getCountry(), get_Particular_CellData(path, 0, 20, 5));
		inputValueElement(pom.get_instance_lp().getMobn(), get_Particular_CellData(path, 0, 23, 5));
		inputValueElement(pom.get_instance_lp().getAdds2(),get_Particular_CellData(path, 0, 24, 5));
		Screenshot(ScPath+"Register.jpg");
		ClickOnElement(pom.get_instance_lp().getSubAcc());
		ClickOnElement(pom.get_instance_lp().getWomen());
	    ClickOnElement(pom.get_instance_lp().getTshirt());
		Switch2Frame(pom.get_instance_lp().getF());
		ClickOnElement(pom.get_instance_lp().getPlusbtn());
		ClickOnElement(pom.get_instance_lp().getSubmit());
		Switch2DefaultContent();
		ClickOnElement(pom.get_instance_lp().getP2c());
		ClickOnElement(pom.get_instance_lp().getChkbtn());
		ClickOnElement(pom.get_instance_lp().getBtn());
		ClickOnElement(pom.get_instance_lp().getChkbox());
		ClickOnElement(pom.get_instance_lp().getProCar());
		ScrollupandDown(pom.get_instance_lp().getScroll());
		Screenshot(ScPath+"payment.jpg");
		Browser_Close();
	}
	}


