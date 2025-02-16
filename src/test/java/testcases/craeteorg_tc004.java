package testcases;

import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.organisationpage;
import testbase.baseClass;

public class craeteorg_tc004 extends baseClass {

	@Test(groups="Master")
	public void craeteorg_tc004() {
		
		loginPage lp=new loginPage(driver);
		lp.setmail("admin");
		lp.passwrd("admin");
		lp.sbmt();
		organisationpage op=new organisationpage(driver);
		op.clickorg();
		op.createorg();
		op.orgname(randomeString());
		homePage hp=new homePage(driver);
		hp.mhover();
		hp.signout();
	}
	
}
