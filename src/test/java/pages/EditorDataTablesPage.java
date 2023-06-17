package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorDataTablesPage {

    public EditorDataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[text()='New']")
    public WebElement newButton;

    @FindBy(xpath = "(//div[@class='DTE_Field_Input'])[1]")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//td[text()='test']")
    public WebElement userName;


}
