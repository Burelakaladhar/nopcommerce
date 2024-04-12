package NopCommerce;

import common.BaseTest;

public class Tests extends BaseTest {

	public static void main(String[] args) throws Exception {
	BaseTest bt= new BaseTest();
	bt.setup();
		
		NopPage np = new NopPage(driver);
		
		np.np();
		np.desc();
		np.note();
		np.Sof();
		bt.quit();
		
	}

}
