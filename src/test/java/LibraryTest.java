import java.sql.Driver;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class LibraryTest {
		WebDriver driver = new ChromeDriver();
	@Test
	public void test1()
	{
		
		driver.get("http://www.google.com");
		WebElement Recherche = driver.findElement(By.id("lst-ib"));
		Recherche.sendKeys("Coupe de Monde");
		List<WebElement> buttons =driver.findElements(By.className("lsb"));
		buttons.get(0).click();
		WebElement imageCoupe =driver.findElement(By.id("dimg_29"));
		imageCoupe.isDisplayed();
		Assert.assertTrue(imageCoupe.isDisplayed());
		
	}
	
 @After
	  public void close()
	 {
		 driver.quit();
	 }
 
 
 
}
    