package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDefs {

	
	@BeforeAll
	public static void setup()
	{
	  System.out.println("Before All scenarios");
	}
	
//	@Before
//	public void setupScenario() {
//		System.out.println("Before Each scenario");
//	}
	
//Ordering Hooks	
//	@Before(order=1)
//	public void readFromPropFile() {
//		System.out.println(" Read From Prop");
//	}
//	@Before(order=2)
//	public void setupChrome() {
//		System.out.println(" Chrome setup");
//	}
//	
//	@Before(order=3)
//	public void connectDB() {
//		System.out.println(" Connect with DB");
//	}
	
	
//Ordering Tagged Hooks
	@Before(value="@SmokeTest",order=1)
	public void readFromPropFileSmoke() {
		System.out.println(" Read From Prop-Smoke");
	}
	@Before(value="@SmokeTest",order=2)
	public void setupChrome() {
		System.out.println(" Chrome setup");
	}
	
	@Before(value="@RegressionTest",order=1)
	public void readFromPropFileReg() {
		System.out.println(" Read From Prop-Reg");
	}
	@Before(value="@RegressionTest",order=2)
	public void setupEdge() {
		System.out.println(" Edge setup");
	}
	
	@AfterAll
	public static void exitAll()
	{
	  System.out.println("After All scenarios");
	}
	
//	@After
//	public void exitScenario() {
//		System.out.println("After Each scenario");
//	}
	
//	@BeforeStep
//	public void beforeStepTest() {
//		System.out.println("Before Each Step");
//	}
//	
//	@AfterStep
//	public void afterStepTest() {
//		System.out.println("After Each Step");
//	}
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println(" User Logged in");
	}
	@When("User create a new Contact")
	public void user_create_a_new_contact() {
		System.out.println(" User create contacts");
	}
	@When("User view Contact Details")
	public void user_view_contact_details() {
		System.out.println(" User view contacts");
	}
	@When("User delete a Contact")
	public void user_delete_a_contact() {
		System.out.println(" User delete contacts");
	}
	@When("User create a new Deal")
	public void user_create_a_new_deal() {
		System.out.println(" User create Deals");
	}
	@When("User view Deals Details")
	public void user_view_deals_details() {
		System.out.println(" User view Deals");
	}
	@When("User delete a Deal")
	public void user_delete_a_deal() {
		System.out.println(" User delete Deals");
	}
	@When("User create a new Task")
	public void user_create_a_new_task() {
		System.out.println(" User create Tasks");
	}
	@When("User view Tasks Details")
	public void user_view_tasks_details() {
		System.out.println(" User view Tasks");
	}
	@When("User delete a Task")
	public void user_delete_a_task() {
		System.out.println(" User delete Tasks");
	}
}
