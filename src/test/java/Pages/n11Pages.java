package Pages;

import Util.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumBy;

import java.time.Duration;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By kategorilerButonu = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");

    public n11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void kategoriTiklama() {
    driver.findElement(kategorilerButonu).click();
    }

    public void elektronikTiklama() {
    }

    public void sepetKontrol() {
    }

    public void sepeteGit() {
    }

    public void urunSepeteEkleme() {
    }

    public void sonuclariGosterTiklama() {
    }

    public void filtrelemeYap() {
    }

    public void filtrelemeTiklama() {
    }

    public void markaSecimi() {
    }

    public void cepTelefonuSecimi() {
    }

    public void telefonVeAksesuarSecimi() {
    }
}
