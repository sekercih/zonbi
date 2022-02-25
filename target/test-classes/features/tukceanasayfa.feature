Feature: Turkceanasayfa
   @Test
  Scenario: bireysel login

    Given kullanici anasayfaya gider

   And kullanici cep telefonunu girer

    Then kullanici sifre girer

   And  kullanici giris yap tiklar

   Then kullanici otp kodu girer

    Then kullanici dogru girdigini test edilir

    And kullanici hemen al sat tiklar
     Then kullanici cuzdanim tiklar














