package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.devtools.v114.database.model.Error;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuAppPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuAppDefinitions {

    HerokuAppPage herokuAppPage = new HerokuAppPage();

    @Then("Add Element butona basar")
    public void addElementButonaBasar(){

        herokuAppPage.addElementButton.click();
    }

    @When("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(herokuAppPage.deleteButton));
    }

    @And("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {

        Assert.assertTrue(herokuAppPage.deleteButton.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu siler")
    public void deleteButonunaBasarakButonuSiler() {

        herokuAppPage.deleteButton.click();
    }

    @And("Delete butonunun gorunmedigini test eder")
    public void deleteButonununGorunmediginiTestEder() {

        int test = 0;

        try {
            Assert.assertTrue(herokuAppPage.deleteButton.isDisplayed());
            test++;
        } catch (NoSuchElementException e) {

        }

        if (test==1){
            int a = 0/0;
        }
    }
}
