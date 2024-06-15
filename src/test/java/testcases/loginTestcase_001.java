package testcases;

import org.testng.annotations.Test;

import pageObjects.loginPage;
import testbase.baseClass;

public class loginTestcase_001 extends baseClass {

	@Test
	public void testlogin() {
	loginPage lp=new loginPage(driver);	
		
	lp.setmail("admin");
	lp.passwrd("admin");
	lp.sbmt();
	}
    	

}
