package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDefs {

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
