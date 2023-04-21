package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpForNewsLetterPage extends BasePage {
    public SignUpForNewsLetterPage(WebDriver driver) {
        super(driver);
    }

    // finding
    @FindBy(css = "div[id='uniform-newsletter']")
    private WebElement signUpForNewsLetterLocator;


    // doing
    public void clickOnSignUpForNewsLetter() {
        signUpForNewsLetterLocator.click();
    }

}


