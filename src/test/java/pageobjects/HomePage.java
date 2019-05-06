package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePage extends Page {


    By nextButton = By.cssSelector("a.right");
    By expectedHeadLine = By.xpath("//h1[contains(text(), 'Example headline 2')]");
    By menu = By.cssSelector("ul.nav > li > a");
    By dropDown = By.cssSelector(".dropdown-menu");

    public HomePage(WebDriver driver) {
        super(driver);
        visit("");
    }


    public void pushNextBtn() {
        click(nextButton);
    }

    public String checkHeadline() {
        pushNextBtn();
        isDisplayed(expectedHeadLine, 5);
        return getElementText(expectedHeadLine);
    }


    public Boolean dropDownAppears() {
        clickAboutItem();
        isDisplayed(dropDown, 10);
        return isDisplayed(dropDown);
    }

    public void clickAboutItem() {
        List<WebElement> menuItems = findElements(menu);
        menuItems.get(1).click();
    }

}
