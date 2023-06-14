
Feature: US1005 Kullanici buttonlari test eder

  Scenario: TC11 kullanici butoonlari ve cikan yazilari test eder

    Given Kullanici "herokuappUrl" anasayfaya gider
    Then Add Element butona basar
    When Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder
    And Sayfayi kapatir
