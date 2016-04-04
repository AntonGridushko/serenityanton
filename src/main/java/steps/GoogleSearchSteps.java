package steps;

import net.thucydides.core.annotations.Step;
import pages.GoogleSearchPage;
import pages.SearchResultsPage;

import static org.junit.Assert.assertTrue;

//import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class GoogleSearchSteps {
    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;


    @Step("Given user is on search page")
    public void user_is_on_search_page() {
        googleSearchPage.open();
    }

    @Step("When user enters {0} in search field")
    public void user_enters(String searchText) {
        googleSearchPage.enterSearchText(searchText);
    }

    @Step("Then user can see {0} in search results")
    public void user_can_see(String resultText) {
        assertTrue(searchResultsPage.searchResultsContain(resultText));
    }
}
