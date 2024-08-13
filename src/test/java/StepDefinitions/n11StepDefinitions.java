package StepDefinitions;

import Pages.n11Pages;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class n11StepDefinitions {

    n11Pages n11Pages = new n11Pages(DriverFactory.getDriver());

    @When("Kategorilere tikla")
    public void kategorilere_tikla() {
        n11Pages.kategoriTiklama();
    }

    @When("Elektronik tiklanir")
    public void elektronik_tiklanir() {
      n11Pages.elektronikTiklama();
    }

    @When("Telefon ve Aksesuarlar secilir")
    public void telefon_ve_aksesuarlar_secilir() {
        n11Pages.telefonVeAksesuarSecimi();
    }

    @When("Cep telefonu secilir")
    public void cep_telefonu_secilir() {
        n11Pages.cepTelefonuSecimi();
    }

    @When("Marka secilir")
    public void marka_secilir() {
        n11Pages.markaSecimi();
    }

    @When("Filtrelemeye tiklanir")
    public void filtrelemeye_tiklanir() {
        n11Pages.filtrelemeTiklama();
    }

    @When("Filtreleme yapilir")
    public void filtreleme_yapilir() {
        n11Pages.filtrelemeYap();
    }

    @When("Sonuclari gostere tiklanir")
    public void sonuclari_gostere_tiklanir() {
        n11Pages.sonuclariGosterTiklama();
    }

    @When("Urun sepete eklenir")
    public void urun_sepete_eklenir() {
        n11Pages.urunSepeteEkleme();
    }

    @When("Sepetime gidilir")
    public void sepetime_gidilir() {
        n11Pages.sepeteGit();
    }

    @Then("Sepete urun geldigi test edilir")
    public void sepete_urun_geldigi_test_edilir() {
        n11Pages.sepetKontrol();
    }


}
