package com.cucumber.framework.runner.ProductCategory;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = { "classpath:featurefile/productCategory/TestTotalNumberOfWomenDressProduct.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class TestTotalNumberOfWomenDressProductRunner {

}
