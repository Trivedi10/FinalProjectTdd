package TDD;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver x;
	String title;
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.gecko.driver", "root\\geckodriver");
		  x= new FirefoxDriver();
		  x.get("http://18.136.172.133:8090/BloggingApplication-0.0.1-SNAPSHOT/");
		  
	  }
	@Test
  public void f() {
	  //System.out.println("came");
	  x.findElement(By.xpath("//*[ @name='title'] ")).sendKeys("narri");
	  x.findElement(By.xpath("//*[ @value='send_title'] ")).click();
	  
	 // x.findElement(By.xpath("//*[ @name='category'] ")).sendKeys("narri");
	  //x.findElement(By.xpath("//*[ @name='author'] ")).sendKeys("narri");
	  
	  title = x.getTitle();
	  
	  System.out.println("Title = "+title);
  }

  @AfterTest
  public void afterTest() {
  }

}
