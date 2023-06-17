Feature: US1008 Toplu kullanici listesi ile negatif login testi

  @qd
  Scenario Outline: TC14 Kullanici Listedeki kullanici bilgileri ile giris yapilamadigini test edebilmeli

    Given Kullanici "qualitydemyUrl" anasayfaya gider
    Then ilk login linkine click yapar
    And user email olarak "<email>" girer
    And password oalarak "<password>" girer
    When login buttonuna basar
    Then giris yapilamadigini test eder
    And Sayfayi kapatir

    Examples:
      | email         | password |
      | abc@gmail.com | 12345    |
      | asd@gmail.com | 6354653  |
      | klm@gmail.com | 68746363 |
      | zzz@gmail.com | Java123  |




