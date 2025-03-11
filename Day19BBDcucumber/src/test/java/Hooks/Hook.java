package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.Base1;
import utility.CaptureScreenShot;

public class Hook extends Base1{
	
	public static Base1 base;
	
	@Before
	public void initBrowser() {

		System.out.println("opening the Browser : Chrome");
        base.driver = new ChromeDriver();
	}

	@After
	public void Close(Scenario scenario) {
		if(scenario.isFailed()) {
			CaptureScreenShot screenshot = new CaptureScreenShot();
			screenshot.getErrorScreenshot(base.driver);
		}
		// System.out.println("Environment is closed");
		// System.out.println("Closing the Browser : chrome");
		else {
		// base.driver.quit();
		}
	}

}
