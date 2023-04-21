package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NamePage extends BasePage {
    public NamePage(WebDriver driver) {
        super(driver);
    }

    // finding
    @FindBy(css = "input[type='text']")
    private WebElement nameLocator;


    // doing
    public void enterName() {

        nameLocator.sendKeys();
    }
}


