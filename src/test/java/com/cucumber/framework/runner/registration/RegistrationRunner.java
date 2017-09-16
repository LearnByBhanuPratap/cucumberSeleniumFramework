package com.cucumber.framework.runner.registration;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/registration/Registration.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class RegistrationRunner  extends AbstractTestNGCucumberTests {

}
