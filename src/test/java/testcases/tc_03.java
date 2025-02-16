package testcases;

import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import testbase.baseClass;

public class tc_03 extends baseClass {
	@Test(groups="Master")
	public void tc_03() {
		
		loginPage lp=new loginPage(driver);
		lp.setmail("admin");
		lp.passwrd("admin");
	
		lp.sbmt();
	
		homePage hp=new homePage(driver);
		//hp.searchddclick();
		//hp.organstn();
		//hp.crtorg();
		hp.lead();
		hp.createlead();
		hp.frstnameld(randomeString());
		
		hp.lastnameld(randomeString());
		hp.compname(randomeString());
		hp.savelead();
		hp.mhover();
		hp.signout();
	}

}
