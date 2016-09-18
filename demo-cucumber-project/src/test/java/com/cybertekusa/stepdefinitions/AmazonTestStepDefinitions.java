package com.cybertekusa.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.cybertekusa.models.Book;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonTestStepDefinitions {

	@Given("^I search for \"([^\"]*)\"$")
	public void i_search_for(String item) throws Throwable {
		System.out.println("I am looking for a " + item);
	}

	@Given("^I select my \"([^\"]*)\" from the results$")
	public void i_select_my_from_the_results(String item) throws Throwable {
		System.out.println("I selct my " + item + " from the results");
	}

	@When("^I add my \"([^\"]*)\" to my cart$")
	public void i_add_my_to_my_cart(String item) throws Throwable {
		System.out.println("I am adding my " + item + " to the cart");
	}

	@Then("^I should be able to see \"([^\"]*)\" on the cart$")
	public void i_should_be_able_to_see_on_the_cart(String item) throws Throwable {
		System.out.println("The cart better have my " + item);
	}

	int size;

	@When("^I select following books from the results:$")
	public void i_select_following_books_from_the_results(List<String> books) throws Throwable {
		for (String book : books) {
			System.out.println("I am selecting " + book);
		}
		size = books.size();
	}

	@Then("^I should have (\\d+) items in my cart$")
	public void i_should_have_items_in_my_cart(int numberOfItems) throws Throwable {
		Assert.assertEquals(size, numberOfItems);
	}

	@Given("^I select the books I want from the list:$")
	public void i_select_the_books_I_want_from_the_list(List<Map<String, String>> books) throws Throwable {
		String name = "Name", author = "Author";
		for (Map<String, String> map : books) {
			System.out.print(map.get(name) + ":\t");
			System.out.print(map.get(author));
			System.out.println();
		}
		size = books.size();
	}

	@Then("^I should have all the items in my cart$")
	public void i_should_have_all_the_items_in_my_cart() throws Throwable {
		int expectedItemCount = 3;
		Assert.assertEquals(size, expectedItemCount);
	}

	@Given("^I select the books I want using followinf information:$")
	public void i_select_the_books_I_want_using_followinf_information(List<Book> books) throws Throwable {
		for (Book book : books) {
			System.out.println(book.getName());
			System.out.println(book.getAuthor());
			System.out.println();
		}
	}

}
