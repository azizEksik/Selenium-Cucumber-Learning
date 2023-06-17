Feature: US0 kullanici data ekleyebilmeli

  Scenario:
    When Kullanici "datatablesUrl" anasayfaya gider
    Then new butonuna basar
    And tum bilgileri girer
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
    And Sayfayi kapatir