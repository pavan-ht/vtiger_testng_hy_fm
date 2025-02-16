package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends Basepage {

	public loginPage(WebDriver driver) {
		super(driver);	
	}
	
    @FindBy(xpath="//input[@name='user_name']")
    WebElement txtemail;
	
    @FindBy(xpath="//input[@type='password']")
    WebElement pwd;
    
    @FindBy(xpath="//input[@id='submitButton']")
    WebElement submit;
    
    public void setmail(String email) {
    	txtemail.sendKeys(email);
    }
    public void passwrd(String password) {
    	
    	pwd.sendKeys(password);
    }
    public void sbmt() {
    	submit.click();
    }
}
