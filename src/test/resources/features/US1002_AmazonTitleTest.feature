Feature: US1002 Amazon Title Test

  @smoke @regression
  Scenario: TC04 Kullanici amazon sayfasinin title'inin dogru oldugunu kontrol eder

    Given Kullanici amazon anasayfaya gider
    Then Title'in Amazon icerdigini test eder
    And Sayfayi kapatir