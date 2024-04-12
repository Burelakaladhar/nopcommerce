package NopCommerce;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import common.BaseTest;

public class MeeshoTest extends BaseTest{
@Test	
	public void meesho () throws Exception{
		MeeshoPage MP = new MeeshoPage(driver);
		
         MP.Mp();
         
	}
@BeforeTest
public void before() throws Exception {
	 setup();
}
@AfterTest
public  void after() throws Exception {
	// quit();
}

}
