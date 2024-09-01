package testbase;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseClass {

	public static WebDriver driver;
	public Logger logger;
	public Properties p;
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os ,String br) throws IOException {
		// loggers
		
		logger =LogManager.getLogger(this.getClass());
		
		//loading properties file
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" :driver =new FirefoxDriver(); break;
		default : System.out.println("inavalid broswer name.."); return;
		
		}
		
		
		
		//driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
	
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@AfterClass
	public void teardown() throws InterruptedException
	{
		System.out.println("test passed");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		

		driver.quit();
	}
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
}}
