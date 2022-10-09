package StepDefinitions;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalcStepDefs {
	
	int result = 0;

	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("This is my calculator");
	}

	@When("I add the numbers {int} and {int}")
	public void i_add_the_numbers_and(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	   
		result = int1 + int2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int ExpRes) {
	    // Write code here that turns the phrase above into concrete actions
	    
		Assert.assertEquals(ExpRes, result);
	}
	
	@When("I add the numbers")
	public void i_add_the_numbers(List<Integer> numbers) {
		
		//io.cucumber.datatable.DataTable dataTable
		
		for(int num: numbers) {
			
			result = result + num;
		}
	}
}
