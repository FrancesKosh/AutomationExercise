package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiveSpecialOffersPage extends BasePage {
    public ReceiveSpecialOffersPage(WebDriver driver) {
        super(driver);
    }

    // finding
    @FindBy(css = "div[class='checkbox']")
    private WebElement signUpForNewsLetterLocator;


    // doing
    public void clickOnSignUpForNewsLetter() {
        signUpForNewsLetterLocator.click();
    }

    }


