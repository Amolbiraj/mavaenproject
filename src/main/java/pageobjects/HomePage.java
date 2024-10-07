package pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	@FindBy(xpath="//span[text()='My Account']") WebElement drop;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement register;
    @FindBy(xpath="(//a[text()='Login'])[1]") WebElement login;
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
public void clickMyAccount() throws InterruptedException
{
	Thread.sleep(5000);
	Actions act =new Actions(driver);
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	//wait.until(ExpectedConditions.elementToBeClickable(drop)).click();
	//act.moveToElement(drop).click().build().perform();
	drop.click();
	
}

public void clickRegister() throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(register)).click();
	//register.click();
}
public void clickLogin()
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	
}

	
}
