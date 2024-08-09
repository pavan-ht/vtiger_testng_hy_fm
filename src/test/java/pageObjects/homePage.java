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
	
	@FindBy(xpath="//img[@align=\"left\"]")
	WebElement srchdd;
	
	@FindBy(xpath="//td[normalize-space()='']//input[@name='search_onlyin']")
	WebElement srcleadsdd;
	
	@FindBy(xpath="//td[@class='tabUnSelected']/a")
	WebElement organisation;
	
	@FindBy(xpath="img[title='Create Organization...']")
	WebElement createorg;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement ldfrstname;
	
	
	public void frstnameld(String ldfrstnm) {
		
		ldfrstname.sendKeys(ldfrstnm);
	}
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
	public void searchddclick() {
		
		srchdd.click();
	}
	public void searchleadsdd() {
		srcleadsdd.click();
	}
	public void organstn() {
		organisation.click();
	}
	public void crtorg() {
		createorg.click();
	}
}
