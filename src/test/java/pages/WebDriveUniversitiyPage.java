package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriveUniversitiyPage {

    public WebDriveUniversitiyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortal;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;
}
