package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualityDemyPage;

public class QualitydemyStepDefinitions {

    QualityDemyPage  qualityDemyPage = new QualityDemyPage();

    @Then("ilk login linkine click yapar")
    public void ilk_login_linkine_click_yapar() {
        qualityDemyPage.loginLink.click();
    }

    @Then("user email olarak {string} girer")
    public void user_email_olarak_girer(String email) {
        qualityDemyPage.emailTextBox.sendKeys(email);
    }

    @Then("password oalarak {string} girer")
    public void password_oalarak_girer(String password) {
        qualityDemyPage.passwordTextBox.sendKeys(password);
    }

    @When("login buttonuna basar")
    public void login_buttonuna_basar() {
        qualityDemyPage.loginButton.click();
    }

    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qualityDemyPage.notLoginText.isDisplayed());
    }

}
