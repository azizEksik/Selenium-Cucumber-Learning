Feature: US2 Yeni bir hesap olusuturma testi
  @aa
  Scenario: TC15 Yeni bir hesap olusuturabilmeli

    Given Kullanici "automationUrl" anasayfaya gider
    And user sign up linkine tiklar
    And user Create an account bolumune email adresi girer
    And signUp butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Create Account butonuna basar
    Then hesap olustugunu test edin