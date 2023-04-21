package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // finding
    @FindBy(css = "i[class='fa.fa-home']")
    private WebElement homePageLocator;


    // doing
    public String getMessage() {
      return homePageLocator.getText();
    }
}


