package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {

	public AccountRegistration(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtfname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtlname;
	@FindBy(xpath="//input[@id='input-email']") WebElement txtemail;
	@FindBy(xpath="//input[@id='input-password']") WebElement txtpass;
	@FindBy(xpath="//input[@type='checkbox'and@name='agree']") WebElement chkpolicy;
	@FindBy(xpath="//button[text()='Continue']") WebElement btnContinue;
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']") WebElement msgconfirm;
	
	
	public void setFirstName(String name)
	{
		txtfname.sendKeys(name);
	}
	public void setLastName(String lname)
	{
		txtlname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setpassword(String pass)
	{
		txtpass.sendKeys(pass);
	}
	public void clickCheckbox()
	{
		Actions act =new Actions(driver);
		act.click(chkpolicy).build().perform();

	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	public String getConfirmation()
	{
		try {
		String message=msgconfirm.getText();
		return message;
		}
		catch(Exception e){
			return e.getMessage();
			
		}
				
	}
	
	

}
