package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {

	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/login");
	}
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
//	}
	
   //	Using Scenario Outline
//	@When("User enters  {string}  and {string}")
//	public void user_enters_and(String strUser, String strPwd) {
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//	}

//	Data passing at step level using Lists
//	@When("User enters  credentials")
//	public void user_enters_credentials(DataTable dataTable) {
//		List<List<String>> users= dataTable.asLists();
//		String strUser= users.get(0).get(0);
//		String strPwd= users.get(0).get(1);
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//	   
//	}
	
//	Data passing at step level using Maps	
	@When("User enters  credentials")
	public void user_enters_credentials(DataTable dataTable) {
		List<Map<String, String>> users= dataTable.asMaps();
		String strUser= users.get(0).get("username");
		String strPwd= users.get(0).get("password");
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(strPwd);
		driver.findElement(By.className("radius")).click();
	   
	}
	@Then("Should display Success Msg")
	public void should_display_success_msg() {
		Boolean res=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
        Assert.assertTrue(res);
      //  driver.close();
	}
	
}
