Feature: Udemy Mobile App

  Scenario: Udemy uygulamasında yazılım kursları arama testi

    Given Udemy uygulamasini ac
    When Arama kutucuguna tikla
    When Yazilim testi yaz ve ara
    Then Yazilim Testi kurslarinin geldigini kontrol et
