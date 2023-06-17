package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AmazonPage;
import pages.HerokuAppPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.security.Key;
import java.time.Duration;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon anasayfaya gider")
    public void kullanciniAmazonAnaSayfayaGider(){
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
    }

    @When("Nutella icin arama yapar")
    public void nutellaIcinAramaYapar(){

        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void aramaSonuclarininNutellaIcerdiginiTestEder(){

        String expectedIcerik = "Nutella";
        String actualIcerik = amazonPage.searchResults.getText();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir(){
        Driver.quitDriver();
    }

    @When("Java icin arama yapar")
    public void javaIcinAramaYapar(){

        amazonPage.searchBox.sendKeys("Java" + Keys.ENTER);
    }

    @Then("Arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder(){

        String expectedIcerik = "Java";
        String actualIcerik = amazonPage.searchResults.getText();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @When("Samsung icin arama yapar")
    public void samsungIcinAramaYapar(){

        amazonPage.searchBox.sendKeys("Samsung" + Keys.ENTER);
    }

    @Then("Arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder(){

        String expectedIcerik = "Samsung";
        String actualIcerik = amazonPage.searchResults.getText();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @Then("Title'in Amazon icerdigini test eder")
    public void titleInAmazonIcerdiginiTestEder() {
        String expectedIcerik = "Amazon";
        String actualIcerik = Driver.getDriver().getTitle();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @Given("Kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) { // amazonUrl, wiseUrl, facebookUrl ....

        Driver.getDriver().get(ConfigurationReader.getProperty(istenenUrl));
    }

    @When("{string} icin arama yapar")
    public void icinAramaYapar(String arancakKelime) {

        amazonPage.searchBox.sendKeys(arancakKelime + Keys.ENTER);
    }

    @Then("Arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String expectedIcerik) {

        String actualAramaSonucu = amazonPage.searchResults.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklenecekSaniye) {

        try {
            Thread.sleep(beklenecekSaniye*1000);
        } catch (InterruptedException e) {

        }
    }


    @And("ilk urunce click yapar")
    public void ilkUrunceClickYapar() {
        amazonPage.ilkUrun.click();
    }

    @And("acilan urun isminin {string} icerdigini test eder")
    public void acilanUrunIsmininIcerdiginiTestEder(String aranacakIcerik) {
        String actualIcerik = amazonPage.ilkUrunIsim.getText();
        String expectedIcerik = aranacakIcerik;

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }
}
