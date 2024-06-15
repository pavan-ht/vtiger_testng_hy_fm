package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends Basepage {

	public homePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//td[@class='tabUnSelected']/a")
	WebElement calender;
	
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	WebElement leads;
	
	@FindBy(xpath="//img[@title='Create Lead...']")
	WebElement crtlead; 
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement entname;
	
	public void cal() {
		calender.click();
	}

	public void lead() {
		leads.click();
	}
	public void createlead() {
		
		crtlead.click();
	}
	public void entername(String name) {
		entname.sendKeys(name);
	}
	
	
	
}
