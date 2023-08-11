package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/featureFilePkg/afourTech.feature"},
		glue = {"aFourStepDefination"},
		monochrome = true
		)


public class aFourtechRunner {

}
