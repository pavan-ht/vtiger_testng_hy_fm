package testcases;

import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import testbase.baseClass;

public class homepage_tc002 extends baseClass{

	@Test(groups= {"Sanity","Master"})
	public void homepagetest() {
		
		loginPage lp=new loginPage(driver);
		lp.setmail("admin");
		lp.passwrd("admin");
		lp.sbmt();
		
		homePage hp=new homePage(driver);
		hp.homepagebutton();
		hp.lead();
		hp.createlead();
		hp.entername(randomeString());
		hp.mhover();
		
		hp.signout();
		
		
	}
	
}
