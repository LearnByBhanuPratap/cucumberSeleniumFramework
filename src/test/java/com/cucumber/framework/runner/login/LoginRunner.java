package com.cucumber.framework.runner.login;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/login/login.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class LoginRunner extends AbstractTestNGCucumberTests {

}
