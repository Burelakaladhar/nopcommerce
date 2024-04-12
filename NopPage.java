package NopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.BaseTest;

public class NopPage extends BaseTest {
	
	WebDriver driver;
	
	@FindBy(linkText  = "Computers ")
	WebElement cps;
	@FindBy(xpath  = "(//a[text()='Desktops '])[1]")
	WebElement Desktops ;
//	@FindBy(linkText = "")
	@FindBy(linkText = " Notebooks ") WebElement NB;
	@FindBy(linkText = "Software ")WebElement SF;


public void np() throws Exception {
	Thread.sleep(5000);
	cps.click();

}
public void desc() throws Exception {
	Thread.sleep(5000);
	Desktops .click();
	
}
public void note()  {
	NB.click();
}
public void Sof() {
	SF.click();
}
public NopPage(WebDriver d) {
	driver=d;
	PageFactory.initElements(d, this);

}
}