package pageclasses;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Base1;

public class Page1 extends Base1{
	public static Base1 base;
	
	By signinLink = By.linkText("Sign in");
	
	By accLink = By.xpath("//u[normalize-space()='Create a new account']");
	
	By fullName = By.xpath("//div[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input[@type='text']");
	
	By rediffId = By.xpath("//td[@valign='bottom']/input[@type='text']"); 
	
	By CheckAvailability = By.xpath("//td[@valign='bottom']/input[@type='button']");
	
	By password = By.id("newpasswd");
	
	By retypePwd = By.id("newpasswd1");
	
	//By alternateEmail = By.name("altemail0eb65b4e");
	
	By checkBox = By.className("nomargin");
	
	By securityQuestion = By.xpath("//div[@id='div_hintQS']/table[1]/tbody/tr[2]/td[3]/select");
	
	By answer = By.xpath("//div[@id='div_hintQS']/table[1]/tbody/tr[4]/td[3]/input");
	
	By motherName = By.xpath("//div[@id='div_hintQS']/table[1]/tbody/tr[6]/td[3]/input");
	
	//By countryCode = By.xpath("//div[@id='wrapper']/table[2]/tbody/tr[20]/td/div/table/tbody/tr/td[3]/div/ul/li");
	
	By mobileNo = By.id("mobno");
	
	By dobDay = By.xpath("//tbody/tr[22]/td[3]/select[1]");
	
	By dobMonth = By.xpath("//tbody/tr[22]/td[3]/select[2]");
	
	By dobYear = By.xpath("//tbody/tr[22]/td[3]/select[3]");
	
	By gender = By.xpath("//input[@value='f']");
	
	By country = By.id("country");

	//By city = By.xpath("//tbody[1]/tr[1]/td[3]/select[1]");
	
	By captcha = By.className("captcha");
	
	By newAcc = By.id("Register");
	
	public void signIn() {
		base.driver.manage().window().maximize();	
		base.driver.findElement(signinLink).click();
	}
	
	public void accountCreation() {
		base.driver.findElement(accLink).click();
	}
	
	public void enterDetails() {
		//Scanner sc = new Scanner(System.in);
		
		base.driver.findElement(fullName).sendKeys("Sedhuram");
		base.driver.findElement(rediffId).sendKeys("sedhuramsiva");
		base.driver.findElement(CheckAvailability).click();
		base.driver.findElement(password).sendKeys("sedhu123");
		base.driver.findElement(retypePwd).sendKeys("sedhu123");
		base.driver.findElement(checkBox).click();
		
		WebElement sq = base.driver.findElement(securityQuestion);
		Select st = new Select(sq);
		st.selectByIndex(2);
		
		base.driver.findElement(answer).sendKeys("Answer");
		base.driver.findElement(motherName).sendKeys("Mother");
		
		//WebElement code = base.driver.findElement(countryCode);
		//Select codeno = new Select(code);
		//codeno.selectByVisibleText("+91");
		
		base.driver.findElement(mobileNo).sendKeys("1234567890");
		
		WebElement day = base.driver.findElement(dobDay);
		Select d = new Select(day);
		d.selectByIndex(5);
		
		WebElement month = base.driver.findElement(dobMonth);
		Select m = new Select(month);
		m.selectByIndex(5);
		
		WebElement year = base.driver.findElement(dobYear);
		Select y = new Select(year);
		y.selectByIndex(5);
		
		base.driver.findElement(gender).click();
		
		WebElement countrySelect = base.driver.findElement(country);
		Select cs = new Select(countrySelect);
		cs.selectByIndex(1);
		
		//WebElement citySelect = base.driver.findElement(city);
		//Select cy = new Select(citySelect);
		//cy.selectByIndex(1);
		
//		WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(captcha));
//		
//		System.out.println("Enter The Captcha: ");
//		base.driver.findElement(captcha).sendKeys(sc.nextLine());
		
	}
	
	public void createAccount() {
		base.driver.findElement(newAcc).click();
	}

}
