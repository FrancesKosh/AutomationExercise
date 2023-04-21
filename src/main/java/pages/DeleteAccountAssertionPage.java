package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedAssertionPage extends BasePage {

    public AccountCreatedAssertionPage(WebDriver driver) {
        super(driver);
    }

    //finding
    @FindBy(css = "h2[data-qa='account-created']")
    private WebElement accountCreatedLocator;


    //Doing

//    public boolean IsMsgDisplayed() {
//        return homePageLocator.isDisplayed();

    public boolean IsAccountCreatedDisplayed() {
      return  accountCreatedLocator.isDisplayed();
}
}
