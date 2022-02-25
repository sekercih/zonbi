package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TurkceAnasayfa {


    public TurkceAnasayfa(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement CepTelefonuGiris;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement AnasayfaSifre;


    @FindBy(xpath = "//button[@type='button']")
    public WebElement GirisYapButonu;

    @FindBy(xpath = "//input[@id='otpCode']")
    public WebElement OtpCode;

    @FindBy(xpath = "//h3[text()='Cüzdanım']")
    public WebElement ASCuzdanim;

    @FindBy(xpath =" //span[text()='Hemen Al Sat']")
    public WebElement HemenAlSat;

    @FindBy(xpath = "//i[@class='ficon icon-wallet']")
    public WebElement Cuzdanim;

    @FindBy(xpath = "//a[text()=' Bireysel Giriş ']")
    public WebElement BireyselGirisButonu;


}
