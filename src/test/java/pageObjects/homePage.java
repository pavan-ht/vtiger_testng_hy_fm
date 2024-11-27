package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath="input[@name='lastname']")
	WebElement ldlastname;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	WebElement saveld;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement cmpname;
	
	@FindBy(xpath="//img[@title='vtiger-crm-logo.gif']")
	WebElement logo;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	WebElement mhover;
	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	WebElement signout;
	
	@FindBy(xpath="//a[@class='hdrLink']")
	WebElement homepagebutton;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement searchbox;
	
	public void searchbox(String text) {
		searchbox.sendKeys(text);
	}
	public void homepagebutton() {
		
		homepagebutton.isDisplayed();
	}
	
	public void signout() {
		signout.click();
	}
	public void mhover() {
		Actions act =new Actions(driver);
		act.moveToElement(mhover).build().perform();
	
	}
	
	public boolean ishomeexists() {
		
		return(logo.isDisplayed());
		
		
	}
	
	public void compname(String cmpname1) {
		
		cmpname.sendKeys(cmpname1);
	}
	public void savelead() {
		
		saveld.click();
	}
	public void lastnameld(String ldlstname) {
		
		ldlastname.sendKeys(ldlstname);
	}
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
