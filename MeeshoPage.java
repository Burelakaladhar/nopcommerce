package NopCommerce;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest;

public class MeeshoPage  extends BaseTest{

	WebDriver driver;
	
	@FindBy( xpath =  "//input[@placeholder='Try Saree, Kurti or Search by Product Code']") WebElement Try;
	@FindBy(linkText = "saree")WebElement saree;
	
	
	public void Mp(){
		Try.sendKeys("saree");
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	
		
	public  MeeshoPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(d, this);
	}
	}
	

