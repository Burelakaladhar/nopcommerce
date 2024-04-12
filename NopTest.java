package NopCommerce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import common.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NopTest  extends BaseTest{
 
 @Test
 
	public void nop() throws Exception {
		
		NopPage np = new NopPage(driver);
		
		//np.np();
		
		
		np.desc();
		np.note();
		np.Sof();
 }
 
 @BeforeTest
 public void before() throws Exception {
	 setup();
 }
 @AfterTest
 public  void after() throws Exception {
	 quit();
 }
 
}

