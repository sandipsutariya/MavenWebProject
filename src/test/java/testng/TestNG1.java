package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestNG1 {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod
@BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\sandip.sutariya\\driver\\IEDriverServer.exe");
    driver = new InternetExplorerDriver();
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSampleLoginApplication() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [openWindow | file:///C:/Users/gauri.devdas.prabhu/MavenWebProject/src/main/webapp/index.jsp | ]]
	  driver.get("http://localhost:8080/firstmavenwebapp/index.jsp");
    AssertJUnit.assertTrue(isElementPresent(By.linkText("Facebook")));
    AssertJUnit.assertTrue(isElementPresent(By.linkText("Twitter")));
    AssertJUnit.assertTrue(isElementPresent(By.linkText("Google+")));
    AssertJUnit.assertEquals(driver.getTitle(), "Sample Login Form");
    driver.findElement(By.id("username")).click();
    AssertJUnit.assertTrue(isElementPresent(By.id("username")));
    AssertJUnit.assertTrue(isElementPresent(By.id("mail")));
    AssertJUnit.assertTrue(isElementPresent(By.id("password")));
    driver.findElement(By.linkText("Create My Account")).click();
  }

  @AfterMethod
@AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      Assert.fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

}
