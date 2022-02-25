Feature: anasayfabutonlar

 @TestB
  Scenario: Anasafya butun butonlar

    Given kullanici anasayfaya gider

    And kullanici kurumsal giris tiklar
    Then kurumsal giris test edilir
   And kullanici bireysel girisi tiklar
    And kullanici cep telefonunu girer
    And kullanici sifre girer
    And kullanici giris yap tiklar
    And kullanici otp kodu girer
    And giris yap test edilir
    And kullanici cikis yapar
    Then kullanici uye ol tiklar
    And uye ol test edilir
    And Kullanici anasayfaya geri doner
    Then kullanici sifremi unuttum tiklar
    And sifremi unuttum test edilir
    And Kullanici anasayfaya geri doner
    Then kullanici sayfayi kapatir
