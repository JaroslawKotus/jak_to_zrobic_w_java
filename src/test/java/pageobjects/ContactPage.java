package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactPage extends Page {

    By elName = By.id("name");
    By elEmail = By.id("email");
    By elMessage = By.id("content");
    By btnSubmit = By.cssSelector("[type='submit']");
    By successMessageLocator = By.xpath("//h3[contains(text(), 'Your message has been sent.')]");


    public ContactPage(WebDriver driver) {
        super(driver);
        visit("/contact.html");
    };

  public void insertDataAndPushSubmit(String name, String email, String text){
        type(name,elName);
        type(email,elEmail);
        type(text,elMessage);
        click(btnSubmit);
  };

  public Boolean successMessagePresent(){
      isDisplayed(successMessageLocator, 10);
      return isDisplayed(successMessageLocator);
  }



}
