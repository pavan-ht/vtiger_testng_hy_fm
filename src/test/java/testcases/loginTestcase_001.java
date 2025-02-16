package testcases;

import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import testbase.baseClass;

public class loginTestcase_001 extends baseClass {

	@Test(groups= {"Regression","Master","smoke"}) 
	public void testlogin() {
		
		logger.info("***************test started*******************");
		
	loginPage lp=new loginPage(driver);	
		
	lp.setmail("admin");
	lp.passwrd("admin");
	lp.sbmt();
	homePage hp =new homePage(driver);
	hp.ishomeexists();
	hp.mhover();
	hp.signout();
	logger.info("***************test ended*******************");
	}
    	

}
