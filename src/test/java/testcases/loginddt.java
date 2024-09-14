package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import testbase.baseClass;
import utilities.DataProviders;

public class loginddt extends baseClass {
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="DDT")
	public void testloginddt(String email, String password, String exp) {
		
		logger.info("***************test started*******************");
		try {
		loginPage lp=new loginPage(driver);	
			
		lp.setmail(email);
		lp.passwrd(password);
		lp.sbmt();
		homePage hp =new homePage(driver);
		boolean target=hp.ishomeexists();
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(target==true)
			{
				hp.mhover();
				hp.signout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(target==true)
			{
				hp.mhover();
				hp.signout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	catch(Exception e)
	{
		Assert.fail("An exception occurred: " + e.getMessage());
	}
		
	logger.info("**** Finished TC_003_LoginDDT *****");
	}
}
