//package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.GoogleSearchSteps;

@RunWith(SerenityRunner.class)
public class GoogleSearchTest {
    @Managed(driver="firefox")
    WebDriver driver;

    @Steps
    GoogleSearchSteps googleSearchSteps;

    @Test
    public void googleSearchTest() {
        googleSearchSteps.user_is_on_search_page();
        googleSearchSteps.user_enters("Selenium");
        googleSearchSteps.user_can_see("Selenium");
    }

    @Test
    @Pending
    public void nonImplementedTest() {
        //TODO: add test here
    }

    @Test
    public void failingTest() {
        //fail("This test is failing for demo purposes");
    }
}
