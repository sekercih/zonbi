package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AnaSayfabutonlar {

    public AnaSayfabutonlar(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()=' Kurumsal Giriş ']")
    public WebElement KurumsalGirisButon;

    @FindBy(xpath = "//p[@class='mb-3 text-center']")
    public WebElement KurumsalGirisYazi;

   @FindBy(xpath = "//a[@class='btn btn-outline-primary btn-block full-radius']")
    public WebElement UyeOlButon;

    @FindBy(xpath = "//p[@class='mb-3 text-center']")
    public WebElement BireyselUyelikDogrulamaYazisi;

   @FindBy(xpath = "//a[@class='card-link']")
    public WebElement SifremiUnuttumButonu;

    @FindBy(xpath = "//p[@class='text-center h5 text-capitalize']")
    public WebElement SifreSifirlamaYazisi;

   @FindBy(xpath = "//div[@class='modal__header']")
    public WebElement OTPdogrulamaYazisi;

   @FindBy(xpath = "//span[@class='avatar avatar-online']")
    public WebElement kullaniciAvatar;

   @FindBy(xpath = "//button[@type='button']")
    public WebElement kullaniciCikisYap;





















}
