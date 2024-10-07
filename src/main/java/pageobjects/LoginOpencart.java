package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilty1.WaitHelper;

public class LoginOpencart extends BasePage {

	public LoginOpencart(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailtxt;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passtxt;
	@FindBy(xpath = "(//button[text()='Login'])")
	WebElement loginbtn;
	@FindBy(xpath = "//a[text()='MP3 Players']")
	WebElement mp3player;
	@FindBy(xpath = "//a[text()='test 16 (0)']")
	WebElement test16;
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement continuebtn;
	@FindBy(xpath = "//img[contains(@title,'iPhone')]")
	WebElement iphonetxt;
	@FindBy(xpath = "//*[text()='Add to Cart']")
	WebElement addcart;
WaitHelper wt=new WaitHelper(driver);

	public void setEmail(String email) {
		wt.waitElement(emailtxt, 20);
		
		emailtxt.sendKeys(email);
	}

	public void setPassword(String pass) {
		wt.waitElement(passtxt, 20);

		passtxt.sendKeys(pass);
	}

	public void clickLogin() {
		wt.waitElement(loginbtn, 20);

		loginbtn.click();
	}

	public void moveToMp3() {
		wt.waitElement(mp3player, 20);
		Actions act = new Actions(driver);

		act.moveToElement(mp3player).build().perform();;
	}
	public void clickTest16() {
	wt.waitElement(test16, 20);
	Actions act = new Actions(driver);

		act.moveToElement(test16).click().build().perform();
		
		
	}
	public void clickOnContinuebtn()
	{
		wt.waitElement(continuebtn, 20);

		continuebtn.click();
	}
	public void clickIphoneimg()
	{
		wt.waitElement(iphonetxt, 20);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",iphonetxt);

		
	}
	public void clickOnAddCart()
	{	wt.waitElement(addcart, 20);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",addcart);
	}
	

}
