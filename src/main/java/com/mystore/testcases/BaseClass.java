package com.mystore.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

/*public class BaseClass 
{
   ReadConfig readConfig= new ReadConfig();
  String url =readConfig.getBaseUrl();
  
  String browser =readConfig.getBrowser();
  
  public static WebDriver driver;
 
  @BeforeClass
  public void setup()
  {
	  switch(browser.toLowerCase())
	  {
	  case "msedge":
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  break;
		  
	  case "firefox":
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  break;
		  
	  case "chrome":
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		  break;
		  default:
			  driver=null;
			  break;
	  }
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
      @AfterClass
      public void tearDown()
      {
    	  driver.close();
    	  driver.quit();
      }
  
}*/
public class BaseClass {
    ReadConfig readConfig = new ReadConfig();
    String url = readConfig.getBaseUrl();
    String browser = readConfig.getBrowser();
    public static WebDriver driver;

    @BeforeClass
    public void setup() {
        // Initialize WebDriver based on browser type
        switch (browser.toLowerCase()) {
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                System.out.println("Edge browser launched");
                break;
                
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                System.out.println("Firefox browser launched");
                break;
                
            case "chrome":
                WebDriverManager.chromedriver().setup();
                
                
                driver = new ChromeDriver();
                System.out.println("Chrome browser launched");
                break;
                
            default:
                throw new IllegalArgumentException("Browser type not supported: " + browser);
        }

        // Verify driver is not null and set default configurations
        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        } else {
            throw new RuntimeException("WebDriver initialization failed for browser: " + browser);
        }
    }

   /* @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }*/
}
