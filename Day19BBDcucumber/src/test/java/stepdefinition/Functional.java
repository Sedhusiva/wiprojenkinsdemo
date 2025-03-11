package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.Page1;
import utility.Base1;


public class Functional extends Base1{

	public static Base1 base;
	Page1 page = new Page1();
	
	
	@Given("I navigate to website page")
	public void i_navigate_to_website_page() {
		//base.driver = new ChromeDriver();
 		base.driver.get("https://www.rediff.com/");
	    System.out.println("Navigated to the website page");
	}

	@When("I clicked signin link")
	public void i_clicked_signin_link() {
		page.signIn();
	    System.out.println("clicked the signIn link");
	}

	@When("I clicked create account link")
	public void i_clicked_create_account_link() {
		page.accountCreation();
	    System.out.println("clicked on create Account");
	}

	@And("I entered the details")
	public void i_entered_the_details() {
		page.enterDetails();
	    System.out.println("Entered the required details in the field");
	}

	@Then("I clicked the create account button")
	public void i_clicked_the_create_account_button() {
		//Assert.assertEquals(10, 20);
	    page.createAccount();
	    System.out.println("Account Created");
	}
}
