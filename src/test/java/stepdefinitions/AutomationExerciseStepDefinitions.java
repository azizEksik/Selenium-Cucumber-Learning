package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.Driver;

import java.security.Key;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    Actions actions = new Actions(Driver.getDriver());

    @And("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        automationExercisePage.loginLink.click();
    }

    @And("user Create an account bolumune email adresi girer")
    public void user_create_an_account_bolumune_email_adresi_girer() {
        automationExercisePage.nameTextBox.sendKeys("UserName");
        automationExercisePage.emailTextBox.sendKeys("accc.bcc2c1@gmail.com");
    }

    @And("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        automationExercisePage.singupButton.click();
    }

    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        actions.click(automationExercisePage.radioButton).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("123456789")
                .sendKeys(Keys.TAB)
                .sendKeys("3")
                .sendKeys(Keys.TAB)
                .sendKeys("m")
                .sendKeys(Keys.TAB)
                .sendKeys("1")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("FirstName")
                .sendKeys(Keys.TAB)
                .sendKeys("LastName")
                .sendKeys(Keys.TAB)
                .sendKeys("Company")
                .sendKeys(Keys.TAB)
                .sendKeys("adress1.")
                .sendKeys(Keys.TAB)
                .sendKeys("adress2")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("State")
                .sendKeys(Keys.TAB)
                .sendKeys("City")
                .sendKeys(Keys.TAB)
                .sendKeys("21070")
                .sendKeys(Keys.TAB)
                .sendKeys("5455454545").perform();
    }

    @And("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        automationExercisePage.createAccountButton.click();
    }

    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {
        Assert.assertTrue(automationExercisePage.createAccountText.isDisplayed());
    }
}
