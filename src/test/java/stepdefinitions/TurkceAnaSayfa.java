package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.TurkceAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TurkceAnaSayfa {
    TurkceAnasayfa Ta = new TurkceAnasayfa();
    @Given("kullanici anasayfaya gider")
    public void
    kullaniciAnasayfayaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("TAUrl"));

    }


    @And("kullanici cep telefonunu girer")
    public void kullaniciCepTelefonunuGirer() throws InterruptedException {




     Ta.CepTelefonuGiris.sendKeys(ConfigReader.getProperty("AnasayfaCepTelefonu"));

    }

    @Then("kullanici sifre girer")
    public void kullaniciSifreGirer() {
     Ta.AnasayfaSifre.sendKeys(ConfigReader.getProperty("AnasayfaSifre"));

    }

    @And("kullanici giris yap tiklar")
    public void kullaniciGirisYapTiklar() throws InterruptedException {
    Thread.sleep(3000);
        Ta.GirisYapButonu.click();

    }


    @Then("kullanici otp kodu girer")
    public void kullaniciOtpKoduGirer() throws InterruptedException {
        Thread.sleep(5000);
        Ta.OtpCode.sendKeys(ConfigReader.getProperty("AnasayfaOTP"));

    }
    @Then("kullanici dogru girdigini test edilir")
    public void kullaniciDogruGirdiginiTestEdilir() {

        Assert.assertTrue(Ta.ASCuzdanim.isDisplayed());
    }



    @And("kullanici hemen al sat tiklar")
    public void kullaniciHemenAlSatTiklar() throws InterruptedException {

        Ta.HemenAlSat.click();
        Thread.sleep(5000);
    }



    @Then("kullanici cuzdanim tiklar")
    public void kullaniciCuzdanimTiklar() throws InterruptedException {
        Thread.sleep(5000);
        Ta.Cuzdanim.click();
    }

    @And("kullanici bireysel girisi tiklar")
    public void kullaniciBireyselGirisiTiklar() {
        Ta.GirisYapButonu.click();
    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.getDriver().quit();
    }
}
