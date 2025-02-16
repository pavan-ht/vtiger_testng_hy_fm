package testcases;

import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import testbase.baseClass;

public class searchbox extends baseClass{
	@Test
	public void searchbox() {
		
		loginPage lp=new loginPage(driver);
		lp.setmail("admin");
		lp.passwrd("admin");
		lp.sbmt();
		
		homePage hp=new homePage(driver);
		hp.homepagebutton();
		hp.searchbox(randomeString());
		
	}
	

}
