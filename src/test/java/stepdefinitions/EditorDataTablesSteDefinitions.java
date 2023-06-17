package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorDataTablesPage;
import utilities.Driver;

import javax.swing.*;
import java.awt.*;

public class EditorDataTablesSteDefinitions {

    EditorDataTablesPage editorDataTablesPage = new EditorDataTablesPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("new butonuna basar")
    public void newButonunaBasar(){

        editorDataTablesPage.newButton.click();
    }


    @And("tum bilgileri girer")
    public void tumBilgileriGirer() {
        actions.click(editorDataTablesPage.firstNameTextBox).
                sendKeys("test" + Keys.TAB).
                sendKeys("test" + Keys.TAB).
                sendKeys("test" + Keys.TAB).
                sendKeys("test" + Keys.TAB).
                sendKeys("test" + Keys.TAB).
                sendKeys("2023-06-15" + Keys.TAB).
                sendKeys("50000" + Keys.TAB).perform();

    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        editorDataTablesPage.createButton.click();
    }

    @When("kullanici ilk isim ile arama yapar")
    public void kullaniciIlkIsimIleAramaYapar() {
        editorDataTablesPage.searchTextBox.sendKeys("test");
    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isimBolumundeIsmininOldugunuDogrular() {

        Assert.assertTrue(editorDataTablesPage.userName.isDisplayed());
    }
}
