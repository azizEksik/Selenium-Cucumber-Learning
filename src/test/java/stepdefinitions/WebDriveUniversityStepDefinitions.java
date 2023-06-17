package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebDriveUniversitiyPage;
import utilities.Driver;

import java.util.Set;

public class WebDriveUniversityStepDefinitions {

    Actions actions = new Actions(Driver.getDriver());
    WebDriveUniversitiyPage webDriveUniversitiyPage = new WebDriveUniversitiyPage();
    String firstWindoHandle;
    String secondWindowHandle;
    @Given("Login Portal a kadar asagi iner")
    public void loginPortalaKadarAsagiIner(){
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
    }

    @And("Login Portal a tiklar")
    public void loginPortalATiklar() {
        firstWindoHandle = Driver.getDriver().getWindowHandle();
        webDriveUniversitiyPage.loginPortal.click();
    }


    @Then("Diger window'a gecer")
    public void digerWindowAGecer() {
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String each : windowHandles){
            if (!each.equals(firstWindoHandle)){
                secondWindowHandle = each;
            }
        }
        Driver.getDriver().switchTo().window(secondWindowHandle);
    }

    @And("username ve password kutularina deger yazar")
    public void usernameVePasswordKutularinaDegerYazar() {
        actions.click(webDriveUniversitiyPage.userNameTextBox)
                .sendKeys("test" + Keys.TAB)
                .sendKeys("test").perform();
    }

    @And("login butonuna basar")
    public void loginButonunaBasar() {
        webDriveUniversitiyPage.loginButton.click();
    }

    @And("Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void popupTaCikanYazininValidationFailedOldugunuTestEder() {
        String actualIcerik = Driver.getDriver().switchTo().alert().getText();
        String expectedIcerik = "validation failed";

        Assert.assertEquals(actualIcerik,expectedIcerik);
    }

    @And("Ok diyerek Popup'i kapatir")
    public void okDiyerekPopupIKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }


    @Then("ilk sayfaya geri donun")
    public void ilkSayfayaGeriDonun() {
        Driver.getDriver().switchTo().window(firstWindoHandle);
    }

    @And("ilk sayfaya donuldugunu test edin")
    public void ilkSayfayaDonuldugunuTestEdin() {
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle = "WebDriverUniversity.com";

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
