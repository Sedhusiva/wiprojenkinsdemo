package Testscript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page1 {
	
	/*WebDriver driver;
	public Page1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username = By.id("email");
	By password = By.name("pass");
	By log = By.xpath("//button[@name='login']");
	By forget = By.linkText("Forgotten password?");*/
	//=================================================
	@FindBy(id="email") WebElement username;
	@FindBy(id="pass") WebElement password;
	@FindBy(xpath="//button[@name='login']") WebElement log;
	@FindBy(linkText="Forgotten password?") WebElement forget;
	
	/*@FindBy(how=How.ID , using="email")WebElement username;
	@FindBy(how=How.NAME , using="pass")WebElement password;
	@FindBy(how=How.XPATH , using="//button[@name='login']")WebElement log;
	@FindBy(how=How.LINK_TEXT, using="Forgotten password?")WebElement forget;*/
	
	public void getLogin(String user , String pass)
	{
		/*WebElement email = driver.findElement(username);
		email.sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(log).click();*/
		username.sendKeys(user);
		password.sendKeys(pass);
		log.click();
	}
	
	public void getRecoveredPwd()
	{
		//driver.findElement(forget).click();
		forget.click();
	}

}
