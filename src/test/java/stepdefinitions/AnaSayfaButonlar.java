package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AnaSayfabutonlar;
import utilities.ConfigReader;
import utilities.Driver;


public class AnaSayfaButonlar {
    AnaSayfabutonlar asb=new AnaSayfabutonlar();



    @And("kullanici kurumsal giris tiklar")
    public void kullaniciKurumsalGirisTiklar() {

    asb.KurumsalGirisButon.click();

    }

    @Then("kurumsal giris test edilir")
    public void kurumsalGirisTestEdilir() {

        Assert.assertTrue(asb.KurumsalGirisYazi.isDisplayed());


    }

    @And("giris yap test edilir")
    public void girisYapTestEdilir() {

        Assert.assertTrue(asb.OTPdogrulamaYazisi.isDisplayed());
    }


    @Then("kullanici uye ol tiklar")
    public void kullaniciUyeOlTiklar() {
        asb.UyeOlButon.click();
    }

    @And("uye ol test edilir")
    public void uyeOlTestEdilir() {
        Assert.assertTrue(asb.BireyselUyelikDogrulamaYazisi.isDisplayed());
    }

    @Then("kullanici sifremi unuttum tiklar")
    public void kullaniciSifremiUnuttumTiklar() {
        asb.SifremiUnuttumButonu.click();
    }

    @And("sifremi unuttum test edilir")
    public void sifremiUnuttumTestEdilir() {
        Assert.assertTrue(asb.SifreSifirlamaYazisi.isDisplayed());
    }

    @And("Kullanici anasayfaya geri doner")
    public void kullaniciAnasayfayaGeriDoner() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);
    }

    @And("kullanici cikis yapar")
    public void kullaniciCikisYapar() {
        asb.kullaniciAvatar.click();
        asb.kullaniciCikisYap.click();
        //merhaba
    }
}
