package com.cucumber.framework.stepdefinition.ProductCategory;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.PageObject.HomePage;
import com.cucumber.framework.PageObject.ProductCategoryPage;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProductCategory {
	private final Logger log = LoggerHelper.getLogger(ProductCategory.class);
	HomePage homepage;
	ProductCategoryPage productCategoryPage;
	
	@Given("^user click on women navigation menu$")
	public void user_click_on_women_navigation_menu() throws Throwable {
	   homepage = new HomePage(TestBase.driver);
	   log.info("clicking on women menu");
	   productCategoryPage = homepage.clickOnMenu(homepage.womenMenu);
	}

	@Then("^verify total number of women products dispalyed as \"([^\"]*)\"$")
	public void verify_total_number_of_women_products_dispalyed_as(String arg1) throws Throwable {
		int total = productCategoryPage.getTotalProducts();
		if(total == Integer.parseInt(arg1)){
			Assert.assertTrue(true, "given product count is matching with runtime product Data");	
		}
		else{
			Assert.assertTrue(false, "given product count is not matching with runtime product Data");
		}
	}
}
