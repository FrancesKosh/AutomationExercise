package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountButtonPage extends BasePage {
    public CreateAccountButtonPage(WebDriver driver) {
        super(driver);
    }

    // finding
    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signUpButtonLocator;


    // doing
    public void clickOnSignUpButton() {

        signUpButtonLocator.click();
    }
}


