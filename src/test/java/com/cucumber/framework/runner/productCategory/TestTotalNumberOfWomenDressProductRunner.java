package com.cucumber.framework.runner.productCategory;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/productCategory/TestTotalNumberOfWomenDressProductRunner.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class TestTotalNumberOfWomenDressProductRunner extends AbstractTestNGCucumberTests {

}
