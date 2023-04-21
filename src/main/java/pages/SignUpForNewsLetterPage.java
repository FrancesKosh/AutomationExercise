package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewsLetterPage extends BasePage {
    public NewsLetterPage(WebDriver driver) {
        super(driver);
    }

    // finding
    @FindBy(css = "input[id='id_gender2']")
    private WebElement mrsTitleLocator;


    // doing
    public void clickOnMrsTitle() {
        mrsTitleLocator.click();
    }

    }


