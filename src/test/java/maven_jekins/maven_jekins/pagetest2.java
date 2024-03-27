package maven_jekins.maven_jekins;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class pagetest2 {
	
	@Test
	public void Testgoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("G")).sendKeys("game",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}

}

