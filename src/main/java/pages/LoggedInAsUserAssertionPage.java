package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogedInAsUserAssertionPage extends BasePage {

    public LogedInAsUserAssertionPage(WebDriver driver) {
        super(driver);
    }

    //finding
    @FindBy(css = "i[class='fa fa-user']")
    private WebElement loggedInAsUserLocator;


    //Doing

//    public boolean IsMsgDisplayed() {
//        return homePageLocator.isDisplayed();

    public boolean IsLoggedInAsUserDisplayed() {
        return loggedInAsUserLocator.isDisplayed();
    }


}
