import org.openqa.selenium.WebDriver;

public class UserStory3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basic d = new Basic();
		WebDriver driver = d.ChromeWebDriver();
		
	/*	As an authenticated user <normal user>
		When I visit <tenant>/auth/login
		Then I should see the login page
		When I login with the correct credentials
		Then I should see the dashboard
		Verify the greeting is visible (eg. Good Morning, <name>)

		Hint: make sure the test can pass at different time of the day (there are 3 different messages for morning, afternoon and night)
	*/
		
		// When I visit https://www.intellihr.com
		
			driver.get("https://qa-tech-test-demo.intellihr.net/");
			driver.manage().window().maximize();
	}

}
