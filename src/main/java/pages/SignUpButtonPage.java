package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailAddressPage extends BasePage {
    public EmailAddressPage(WebDriver driver) {
        super(driver);
    }

    // finding
    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement emailAddressPageLocator;


    // doing
    public void enterEmailAddress() {

        emailAddressPageLocator.sendKeys();
    }
}


