package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;

	@FindBy (name= "email_create") private WebElement email;
	
	@FindBy (xpath= "//button[@id='SubmitCreate']") private WebElement login;
	
	@FindBy (xpath="(//div[@class='radio'])[2]") private WebElement title;
	
	@FindBy (xpath="//input[@id='customer_firstname']") private WebElement firstname ;
	
	@FindBy (xpath="//input[@id='customer_lastname']") private WebElement lastname;
	
	@FindBy (xpath="//input[@name='passwd']") private WebElement paswd;
	
	@FindBy (xpath="//select[@id='days']") private WebElement Days;
	
	@FindBy (xpath="//select[@id='months']") private WebElement Months;
	
	@FindBy (xpath="//select[@id='years']") private WebElement Years;
	
	@FindBy (xpath="//input[@id='newsletter']") private WebElement cb1;
	
	@FindBy (xpath="//input[@id='optin']") private WebElement cb2;

	@FindBy (xpath="//input[@id='company']") private WebElement comp;
	
	@FindBy (xpath="//input[@id='address1']") private WebElement adds;
	
	@FindBy (xpath="//input[@id='city']") private WebElement city;

	@FindBy (id="id_state") private WebElement state;
    
	@FindBy (xpath="//input[@id='postcode']") private WebElement pstc;
	
	@FindBy (xpath="//input[@id='phone_mobile']") private WebElement mobn ;
	
	@FindBy (xpath="//input[@id='alias']") private WebElement adds2;
	
	@FindBy (xpath="//button[@id='submitAccount']") private WebElement subAcc;
	
	@FindBy (xpath="//a[@title='Women']") private WebElement women;
	
	@FindBy (xpath= "//img[@title='Faded Short Sleeve T-shirts']") private WebElement Tshirt;
	
	@FindBy (xpath="//iframe[@class='fancybox-iframe']") private WebElement f;
	
	@FindBy (xpath="//i[@class='icon-plus']") private WebElement plusbtn;
	
	@FindBy (xpath="//button[@name='Submit']") private WebElement submit;

	@FindBy (xpath="//a[@title='Proceed to checkout']") private WebElement p2c;

	@FindBy (xpath="//a[@class='button btn btn-default standard-checkout button-medium']") private WebElement chkbtn;
	
	@FindBy (xpath="//button[@class='button btn btn-default button-medium']") private WebElement btn;
	
	@FindBy (xpath="//input[@type='checkbox']") private WebElement chkbox;
	
	@FindBy (xpath="//button[@name='processCarrier']") private WebElement proCar;
	
	@FindBy (xpath="//h1[contains(text(),'Please')]") private WebElement scroll;
	
	@FindBy(id="id_country") private WebElement country;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPaswd() {
		return paswd;
	}

	public WebElement getDays() {
		return Days;
	}

	public WebElement getMonths() {
		return Months;
	}

	public WebElement getYears() {
		return Years;
	}

	public WebElement getCb1() {
		return cb1;
	}

	public WebElement getCb2() {
		return cb2;
	}

	public WebElement getComp() {
		return comp;
	}

	public WebElement getAdds() {
		return adds;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPstc() {
		return pstc;
	}

	public WebElement getMobn() {
		return mobn;
	}

	public WebElement getAdds2() {
		return adds2;
	}

	public WebElement getSubAcc() {
		return subAcc;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return Tshirt;
	}

	public WebElement getF() {
		return f;
	}

	public WebElement getPlusbtn() {
		return plusbtn;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getP2c() {
		return p2c;
	}

	public WebElement getChkbtn() {
		return chkbtn;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getChkbox() {
		return chkbox;
	}

	public WebElement getProCar() {
		return proCar;
	}

	public WebElement getScroll() {
		return scroll;
	}
	public WebElement getCountry() {
		return country;
	}
	
}
