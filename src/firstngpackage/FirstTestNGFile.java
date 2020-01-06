package firstngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;



public class FirstTestNGFile {
	
	  public WebDriver driver1;
	  
	  @BeforeSuite
	    public void SetBrowser(){

		  System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver.exe");

	        driver1= new ChromeDriver();

	    }

    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String expectedTitle = "Welcome: Mercury Tours";
  
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching CHROME browser"); 
     driver1.get(baseUrl);
      String actualTitle = driver1.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver1.close();
  }
}