Feature: Hepsiburada Page Test Automation

  #CaseID:1
  Scenario: Kullanıcı girişi yapılarak sepete ürün eklenmesi
    Given 'https://www.hepsiburada.com/' sayfasına gidilir.
    When Giriş Yap ya da üye ol kısmında Giriş Yap tıklanır.
    And Email adresi 'Daha önce login olmuş bir mail adresi' girilir.
    And Email alanında Giriş Yap tıklanır.
    And Şifre 'Daha önce login olmuş bir kullanıcı şifresi' girilir.
    And Şifre alanında Giriş Yap tıklanır.
    Then 'Hesabım' yazısı görülerek başarılı giriş yapıldığı doğrulanır.
    When Arama kutucuğuna 'Bilgisayar' yazılarak ürün aratılır.
    And Ürün listesinden 1. ürün seçilir
    Then Pencere geçişi yapılır.
    And Ürün sayfası kontrol edilir.
    And Tüm Satıcılar tab'ı tıklanır.
    And Ürün ilk satıcıdan sepete eklenir.
    And Onarım Paketi popup'ında Onarım pakati istemiyorum tıklanır.
    And İkinci popup kapatılır.
    And Ürün ikinci satıcıdan sepete eklenir.
    And Onarım Paketi popup'ında Onarım pakati istemiyorum tıklanır.
    And İkinci popup kapatılır.
    And Sepetim tıklanır.
    Then Farklı satıcılardan sepete eklenen iki ürün Sepetim alanında görülür.

    #CaseID:2
    Scenario: Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
      Given 'https://www.hepsiburada.com/' sayfasına gidilir.
      When Arama kutucuğuna 'Bilgisayar' yazılarak ürün aratılır.
      And Ürün listesinden 1. ürün seçilir
      Then Pencere geçişi yapılır.
      And Ürün sayfası kontrol edilir.
      And Tüm Satıcılar tab'ı tıklanır.
      And Ürün ilk satıcıdan sepete eklenir.
      And Onarım Paketi popup'ında Onarım pakati istemiyorum tıklanır.
      And İkinci popup kapatılır.
      And Ürün ikinci satıcıdan sepete eklenir.
      And Onarım Paketi popup'ında Onarım pakati istemiyorum tıklanır.
      And İkinci popup kapatılır.
      And Sepetim tıklanır.
      Then Farklı satıcılardan sepete eklenen iki ürün Sepetim alanında görülür.