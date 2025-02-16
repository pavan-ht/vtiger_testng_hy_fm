package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class organisationpage extends Basepage{

	public organisationpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@name='accountname']")
	WebElement orgnstname;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	WebElement saveorg;
	
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	WebElement clickorg;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	WebElement createorg;
	
	public void createorg()
	{
		createorg.click();
	}
	
	public void clickorg()
	{
		clickorg.click();
	}
	public void orgname(String orgstname) {
		
		orgnstname.sendKeys(orgstname);
	}
    public void saveorg() {
    	
    	saveorg.click();
    }
	
}
