Feature: Hepsiburada Page Test Automation

  Scenario Outline: Farklı datalar ile Login senaryoları

  #CaseID:1
  #Başarılı kullanıcı girişi
    Given Kullanıcı, Hepsiburada.com sayfasını ziyaret eder.
    When Kullanıcı girişi sayfasına gidilir.
    And Email adresi <email> girilir.
    And 'Giriş Yap' tıklanır.
    And Şifre <şifre> girilir.
    And 'Giriş Yap' tıklanır.
    And 'Hesabım' butonu tıklanır.
    Then 'Çıkış Yap' butonu tıklanır.

    Examples:
      | email                      | şifre      |
      #email doğru password doğru#
      | test_example_123456@test_example.com | examplEtesT7854U |

   #CaseID:2
   #Hatalı email girişi
    Given Kullanıcı, Hepsiburada.com sayfasını ziyaret eder.
    When Kullanıcı girişi sayfasına gidilir.
    And Email adresi <email> girilir.
    And 'Giriş Yap' tıklanır.
    Then 'Geçerli bir e-posta adresi girmelisiniz' uyarısı görülür.

    Examples:
      | email                      |
      #email yanlış
      | test |

    #CaseID:3
    # Hatalı şifre girişi
    Given Kullanıcı, Hepsiburada.com sayfasını ziyaret eder.
    When Kullanıcı girişi sayfasına gidilir.
    And Email adresi <email> girilir.
    And 'Giriş Yap' tıklanır.
    And Şifre <şifre> girilir.
    And 'Giriş Yap' tıklanır.
    Then 'Girdiğiniz şifre eksik veya hatalı.' uyarısı görülür.

    Examples:
      | email                      | şifre      |
      #email doğru password yanlış#
      | test_example_123456@test_example.com | test |


    #CaseID:4
    # Boş email girişi
    Given Kullanıcı, Hepsiburada.com sayfasını ziyaret eder.
    When Kullanıcı girişi sayfasına gidilir.
    And 'Giriş Yap' tıklanır.
    Then 'E-posta adresinizi veya telefon numaranızı girmelisiniz.' uyarısı görülür.

    #CaseID:5
    # Daha önce Login olmamış email girişi
    Given Kullanıcı, Hepsiburada.com sayfasını ziyaret eder.
    When Kullanıcı girişi sayfasına gidilir.
    And Email adresi <email> girilir.
    And 'Giriş Yap' tıklanır.
    Then 'E-posta adresi eksik veya hatalı.' uyarısı görülür.

    Examples:
      | email                      |
      #email yanlış
      | test_deneme@test123.com |

    #CaseID:6
    # Boş şifre girişi
    Given Kullanıcı, Hepsiburada.com sayfasını ziyaret eder.
    When Kullanıcı girişi sayfasına gidilir.
    And Email adresi <email> girilir.
    And 'Giriş Yap' tıklanır.
    And Şifre alanına tıklanır.
    And Sayfada boş bir alan tıklanır.
    Then 'Şifrenizi girmelisiniz.' uyarısı görülür.

    Examples:
      | email                      |
      #email doğru
      | test_example_123456@test_example.com |
