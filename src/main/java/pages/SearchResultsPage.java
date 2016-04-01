package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by vadimzubovich on 4/1/2016.
 */
public class SearchResultsPage extends PageObject{

    public boolean searchResultsContain(String searchText) {
        List<WebElementFacade> searchResults = findAll(By.cssSelector("div.srg div.rc h3"));

        for (WebElement result : searchResults) {
            if (!result.getText().toLowerCase().contains(searchText.toLowerCase())) {
                return false;
            }
        }

        return true;
    }
}
