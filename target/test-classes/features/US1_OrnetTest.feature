Feature: yanlis kullanici adi ve sifre ile login olamama

  Scenario:
    Given Kullanici "webDriveUniversityUrl" anasayfaya gider
    Then Login Portal a kadar asagi iner
    And Login Portal a tiklar
    Then Diger window'a gecer
    And username ve password kutularina deger yazar
    And login butonuna basar
    And Popup'ta cikan yazinin validation failed oldugunu test eder
    And Ok diyerek Popup'i kapatir
    Then ilk sayfaya geri donun
    And ilk sayfaya donuldugunu test edin
    And Sayfayi kapatir
