package com.amazon.step_definitions;


import com.amazon.pages.basePage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefs {

    basePage base=new basePage();
    String shoe;
    String expectedItem;
    String shoe2;

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitForPageToLoad(3);

    }
    @When("user clicks the search box")
    public void user_clicks_the_search_box() {
        base.searchBox.click();
    }
    @When("user enters {string} on search box")
    public void user_enters_on_search_box(String item) {
        base.searchBox.sendKeys(item);
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
        base.searchButton.click();
        BrowserUtils.waitForPageToLoad(5);
    }
    @Then("the searched items should be displayed")
    public void the_searched_items_should_be_displayed() {
        Driver.get().getTitle();
        Assertions.assertEquals("Amazon.com : Shoes", Driver.get().getTitle());
        System.out.println(Driver.get().getTitle());
        base.results.getText();
        Assertions.assertEquals("1-48 of over 60,000 results for", base.results.getText());
        System.out.println(base.results.getText());

    }
    @Then("user clicks the on the second shoe")
    public void user_clicks_the_on_the_second_shoe() {

        System.out.println(base.itemList.size());
        shoe =base.itemList.get(3).getText();
        System.out.println(shoe);
        base.itemList.get(3).click();
        BrowserUtils.waitForPageToLoad(5);

    }
    @Then("the selected shoe should be displayed")
    public void the_selected_shoe_should_be_displayed() {
        expectedItem= Driver.get().getTitle();
        System.out.println(Driver.get().getTitle());
        Assertions.assertTrue(Driver.get().getTitle().contains(shoe));
        Assertions.assertEquals(expectedItem,Driver.get().getTitle() );

    }






}
