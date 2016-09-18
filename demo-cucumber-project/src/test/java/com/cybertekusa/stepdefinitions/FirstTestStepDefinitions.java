package com.cybertekusa.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cybertekusa.pages.AmazonHomePage;
import com.cybertekusa.utilities.Hook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstTestStepDefinitions {
	WebDriver driver;

	@Given("^I go to Amazon$")
	public void i_go_to_Amazon() throws Throwable {
		System.out.println("\nI go to the amazon website");
		driver = Hook.getDriver();
		driver.get(AmazonHomePage.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@When("^I search for stuff$")
	public void i_search_for_stuff() throws Throwable {
		AmazonHomePage page = new AmazonHomePage(driver);
		System.out.println("I am now searching for stuff");
		page.getInputBox().sendKeys("stuff");
	}

	@Then("^I should be able to see stuff$")
	public void i_should_be_able_to_see_stuff() throws Throwable {
		System.out.println("wow look at all this stuff");
		Assert.assertTrue(driver.getTitle().contains("Amazon"));
	}

	@When("^I select my stuff from the results$")
	public void i_select_my_stuff_from_the_results() throws Throwable {
		System.out.println("I am not selecting my stuff");
	}

	@Then("^I should be able to checkout my stuff$")
	public void i_should_be_able_to_checkout_my_stuff() throws Throwable {
		System.out.println("I can not chech stuff out");
	}

	@When("^I add my stuff to my cart$")
	public void i_add_my_stuff_to_my_cart() throws Throwable {
		System.out.println("I am adding my stuff to my cart");
	}

	@Then("^I should be able to see it on the cart$")
	public void i_should_be_able_to_see_it_on_the_cart() throws Throwable {
		System.out.println("I can now see it");
	}

	@When("^I add bunch of stuff to my cart$")
	public void i_add_bunch_of_stuff_to_my_cart() throws Throwable {
		System.out.println("I am now adding aaaaall of it");
	}

	@Then("^I should be able to see all on the cart$")
	public void i_should_be_able_to_see_all_on_the_cart() throws Throwable {
		System.out.println("Look they are all here");
	}

	@Given("^I select my only stuff from the results$")
	public void i_select_my_only_stuff_from_the_results() throws Throwable {
		System.out.println("I am adding my only stuff");
	}

}
