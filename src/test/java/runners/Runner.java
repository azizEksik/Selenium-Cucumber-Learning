package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features" ,
        glue = "stepdefinitions",
        tags = "@ss",

        dryRun = false

)

public class Runner {

    /*
        Cucumber'da Runner class'i istedigimiz testleri calistirmak
        ve her calistiirlan tes icin rapor hazirlamak amaciyla kullanilir

        Runner Class'i bos bir Class'tir

        Belirtilen bu isleri
        class icerisindeki kodlar degil
        class deklerasyonunda kullanacagimizi notasyonlar halleder

        @RunWith notasyonu framework'umuze JUnit yüklememimizin sebebidir
                 ve Runner class'inin cucumber ile calismasini saglar

        @CucumberOptions ise framework'umuzde gerekli ayarlari yapar

        features : feature dosyalarimizin bulundugu konumu gosterir
                   dikkat edilirse tek tek feature dosyalarini degil
                   tum feature doyalarini iceren klasorun yolunu yaziyoruz

        glue : feature dosyalari ile bagli olan
               Java methodlarinin yerini gosterir
               Burada da tek tek calss'lari degil ,
               tum class'lari iceren package'in adresini yazariz
               boylece ilgili step hangi class altinda olursa olsun,
               cucumber bulup calistirir

        tags : calistirilacak Feature veya Scenario(lari) isaretlemek icin kullanilir
               cucumber Runner class'i calistirildiginda
               tum feature dosyalarini gozden gecirir ve
               Runner calss'inda belirtilen tag'a sahip
               TUM feature ve Scenario(lari) calistirir

        Eger birden fazla tag'i kontrol ederek calistirmasini istersek
        "@regression or @smoke" veya "@regression and @smoke" gibi yazabiliriz

        dryRun : bir feature dosyasini ilk defa yazdigimizda
                 step'lerden bazilari daha once var oldugundan BEYAZ
                 bazilari ise ilk defa kullanacagimiz icin SARI olur

                 Bu feature direkt calistirmak istersek
                 Bastan baslayarak beyaz olan adimlari calistirir
                 Ilk sari adima geldiginde, exception firlatip
                 calistirmayi ilk sari satir
                 ve geriye kalan sair satirlarin
                 eksik step'lerini bize yazdirir

                 Amacimiz feature dosyasini calistirmak degil,
                 sadece eksik step'lere ait kodlari olusturmak ise
                 Runner class'inda dryRun = true yapip
                 Runner class'i calistiririz

                 dryRun = true dedigimizde
                 Cucumber testleri calistirmaz, sadece eksik adım var mi diye kontrol eder
                 eksik adim yoksa Test PASSED yazar

                 dryRun = false default degerdir
                 ve Testleri normalş olarak calistirmamizi saglar

     */
}
