package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bncone {
	
	WebDriver driver; 
	
	@Given ("the user is at the login page")
	public void theUserIsAtTheLoginPage () throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://172.31.101.130/local_pibee/login_pibee.html");
	Thread.sleep(3000);
	driver.findElement(By.id("details-button")).click();
	driver.findElement(By.id("proceed-link")).click();
	driver.findElement(By.xpath("//*[@id=\"myModal1}\"]/div/div/button/span")).click();
	}

	@When ("the user enters the company code")
	public void theUserEntersTheCompanyCode () throws InterruptedException {
	driver.findElement(By.id("cod_emp")).sendKeys("29986286");
    Thread.sleep(500);
	}

	@And ("the user enters the user code")
	public void theUserEntersTheUserCode () throws InterruptedException {
	driver.findElement(By.id("cod_usu")).sendKeys("FABRICA1");
	Thread.sleep(500);
	}
	
	@And ("the user	enters the access key") 
	public void theUserEntersTheAccessKey () throws InterruptedException {
	driver.findElement(By.id("eai_password")).sendKeys("q1w2e3r4");
	Thread.sleep(500);
	}
	
	@And ("the user clicks on Accept button")
	public void theUserClicksOnAcceptButton () throws InterruptedException {
	driver.findElement(By.id("aceptar")).click();
	Thread.sleep(3500);
	}
	
	@Then ("the BNC home page is displayed")
	public void theBNCHomePageIsDisplayed () {
	String homeval = driver.findElement(By.xpath("//*[@id=\"kyop-breadcrum-container\"]/div[1]/a")).getText();
	Assert.assertEquals("Portada",homeval);
	driver.quit();
	}
}
	