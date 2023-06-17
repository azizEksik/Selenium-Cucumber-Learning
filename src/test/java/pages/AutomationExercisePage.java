package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = " //a[@href='/login']")
    public WebElement loginLink;

    @FindBy(xpath = "(//form[@action='/signup'])[1]/input[2]")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//form[@action='/signup'])[1]/input[3]")
    public WebElement emailTextBox;

    @FindBy(xpath = "(//form[@action='/signup'])[1]/button[text()='Signup']")
    public WebElement singupButton;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement radioButton;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement createAccountText;
}
