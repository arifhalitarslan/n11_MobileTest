package Pages;

import Util.ElementHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    //new UiSelector().resourceId("com.dmall.mfandroid:id/listingSuggestionItemNameTV")
    By apple = new By.ByXPath("(//*[@resource-id='com.dmall.mfandroid:id/listingSuggestionItemNameTV'])[2]");
    By filtreleme = new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/listingFilterRL\")");
    By dahiliHafıza = new MobileBy.ByAndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By uygulaButton = new MobileBy.ByAndroidUIAutomator("new UiSelector().text(\"Uygula\")"); 
    By sonucGoster = new MobileBy.ByAndroidUIAutomator("new UiSelector().text(\"Sonuçları Göster\")");
    By sepetKontrol = new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayout\")");
    
    
    public n11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void kategoriTiklama()  {

     //  driver.findElement(closeButton).click();
        List<WebElement> listOfElement = driver.findElements(new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/navigation_bar_item_icon_view\")")) ;
        listOfElement.get(1).click();
    }

    public void elektronikTiklama() {

        List<WebElement> elektroniktikla = driver.findElements(new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        elektroniktikla.get(1).click();

    }

    public void telefonVeAksesuarSecimi() {

        List<WebElement> aksesuarVeTelefon = driver.findElements(new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        aksesuarVeTelefon.get(0).click();

    }

    public void cepTelefonuSecimi() {
        List<WebElement> cepTelefonuSecimi = driver.findElements(new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        cepTelefonuSecimi.get(0).click();
        
    }

    public void markaSecimi() {

        driver.findElement(apple).click();
        
    }

    public void filtrelemeTiklama() {
        driver.findElement(filtreleme).click();
    }

    public void filtrelemeYap() {
        driver.findElement(dahiliHafıza).click();
    List<WebElement> gbSecimi = driver.findElements(new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/selectionStatusCB\")"));
    gbSecimi.get(1).click();
    }

    public void sonuclariGosterTiklama() {
    driver.findElement(uygulaButton).click();
    driver.findElement(sonucGoster).click();
    }

    public void urunSepeteEkleme() {
        List <WebElement> plusButton = driver.findElements(new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")"));
        plusButton.get(0).click();
    }

    public void sepeteGit() {
        List<WebElement> listOfElement = driver.findElements(new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/navigation_bar_item_icon_view\")")) ;
        listOfElement.get(2).click();
    }

    public void sepetKontrol() {

    }
}
