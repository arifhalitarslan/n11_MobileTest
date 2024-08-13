@n11
Feature: n11 Mobil uygulamasi
  Scenario: N11 mobil uygulamasi ile Telefon satin alma otomasyonu
    When Kategorilere tikla
    When Elektronik tiklanir
    When Telefon ve Aksesuarlar secilir
    When Cep telefonu secilir
    When Marka secilir
    When Filtrelemeye tiklanir
    When Filtreleme yapilir
    When Sonuclari gostere tiklanir
    When Urun sepete eklenir
    When Sepetime gidilir
    Then Sepete urun geldigi test edilir
