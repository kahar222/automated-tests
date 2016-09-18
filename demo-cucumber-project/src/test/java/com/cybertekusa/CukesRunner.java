package com.cybertekusa;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { 
				"html:target/cucumber/html"
//				,"json:target/cucumber/json"
			}, 
		dryRun = false, 
		tags = { "@cart_test" })
//		features = {"./src/test/resources/com/cybertekusa/features"})
// 		glue = {"./src/test/java/com/cybertekusa/stepdefinitions"}

//Hello Cybertek
public class CukesRunner {

}
