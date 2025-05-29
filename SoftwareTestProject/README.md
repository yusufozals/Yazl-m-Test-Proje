# REST Assured Test Project

Bu proje, Java ile REST API testleri yazmayı öğrenmek için hazırlanmış basit bir örnektir. REST Assured framework'ü kullanarak HTTP isteklerini test eder.

## 🚀 Özellikler

- GET ve POST HTTP isteklerinin test edilmesi
- JSON response validasyonu
- Status code kontrolü
- Request/Response logging
- JUnit 5 ile test yapısı

## 🛠️ Teknolojiler

- **Java 24** - Programlama dili
- **Maven** - Proje yönetimi ve bağımlılık yönetimi
- **REST Assured 5.3.0** - API test framework'ü
- **JUnit 5.9.2** - Test framework'ü
- **Hamcrest 2.1** - Assertion kütüphanesi

## 📋 Gereksinimler

- Java 17 veya üzeri
- Maven 3.6 veya üzeri
- İnternet bağlantısı (httpbin.org API'sine erişim için)

## 📦 Kurulum

1. Projeyi klonlayın:
```bash
git clone https://github.com/yusufozals/Yazl-m-Test-Proje.git
cd SoftwareTestProject
```

2. Maven bağımlılıklarını yükleyin:
```bash
mvn clean install
```

## 🏃‍♂️ Testleri Çalıştırma

### IDE ile
- IntelliJ IDEA veya Eclipse'de `RestAssuredTest.java` dosyasını açın
- Sınıfın yanındaki yeşil play butonuna tıklayın
- Veya tek tek test metodlarını çalıştırın

### Maven ile
```bash
# Tüm testleri çalıştır
mvn test

# Sadece belirli bir test sınıfını çalıştır
mvn test -Dtest=RestAssuredTest
```

### Komut satırından
```bash
# Test raporu ile birlikte
mvn clean test
```

## 📊 Test Detayları

### 1. GET Request Testi (`testGetRequest`)
- **Endpoint:** `https://httpbin.org/get`
- **Test edilen özellikler:**
  - Status code: 200 OK
  - Response URL doğruluğu
  - Headers'ın varlığı
  - Origin IP'nin varlığı

### 2. POST Request Testi (`testPostRequest`)
- **Endpoint:** `https://httpbin.org/post`
- **Test edilen özellikler:**
  - Status code: 200 OK
  - JSON data'nın doğru echo edilmesi
  - Request body'deki tüm alanların response'da bulunması
  - Content-Type header'ının doğruluğu

## 📁 Proje Yapısı

```
SoftwareTestProject/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── api/
│                       └── RestAssuredTest.java
├── pom.xml
└── README.md
```

## 🔧 Maven Dependencies

```xml
<dependencies>
        <!--  Rest Assured -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>4.5.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>5.3.0</version>
            <scope>test</scope>
        </dependency>
        <!--  JUnit 4 (test framework) -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>

        <!--  JSON Path (response verilerini ayrıştırmak için) -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>json-path</artifactId>
            <version>4.5.1</version>
        </dependency>
    </dependencies>
```

## 📝 Örnek Test Çıktısı

```
Request method:	GET
Request URI:	https://httpbin.org/get
Proxy:			<none>
Request params:	<none>
Query params:	<none>
Form params:	<none>
Path params:	<none>
Headers:		Accept=*/*
Cookies:		<none>
Multiparts:		<none>
Body:			<none>

HTTP/1.1 200 OK
Content-Type: application/json

{
  "args": {},
  "headers": {
    "Accept": "*/*",
    "Host": "httpbin.org"
  },
  "origin": "x.x.x.x",
  "url": "https://httpbin.org/get"
}

GET /get testi başarılı!
```

## 🎯 Öğrenme Hedefleri

Bu proje ile şunları öğrenebilirsiniz:

1. **REST Assured Temelleri**
   - `given()`, `when()`, `then()` yapısı
   - HTTP metodları (GET, POST)
   - Header ve body yönetimi

2. **Test Validasyonu**
   - Status code kontrolü
   - JSON response parsing
   - Hamcrest matchers kullanımı

3. **Test Yapısı**
   - JUnit 5 annotations
   - Test sınıfı organizasyonu
   - Setup metodları

4. **Debugging**
   - Request/Response logging
   - Test failure analizi

## 🔍 Test API'si: httpbin.org

Bu projede test API'si olarak [httpbin.org](https://httpbin.org) kullanılmıştır. Bu API:

- ✅ Ücretsiz ve herkese açık
- ✅ API key gerektirmiyor
- ✅ HTTP test istekleri için özel olarak tasarlanmış
- ✅ Gönderdiğiniz veriyi echo ediyor
- ✅ Çeşitli HTTP metodlarını destekliyor

## 🚧 Geliştirilecek Özellikler

- [ ] PUT ve DELETE testleri
- [ ] Authentication testleri
- [ ] XML response testleri
- [ ] Error handling testleri
- [ ] Parameterized testler
- [ ] Test data management
- [ ] Performance testleri
- [ ] Reporting entegrasyonu

## 🤝 Katkıda Bulunma

1. Fork yapın
2. Feature branch oluşturun (`git checkout -b feature/amazing-feature`)
3. Commit yapın (`git commit -m 'Add amazing feature'`)
4. Push edin (`git push origin feature/amazing-feature`)
5. Pull Request açın

## 📄 Lisans

Bu proje eğitim amaçlıdır ve özgürce kullanılabilir.

## 🆘 Sorun Giderme

### Yaygın Sorunlar

1. **Connection timeout**
   - İnternet bağlantınızı kontrol edin
   - Firewall ayarlarını kontrol edin

2. **Maven dependency hatası**
   ```bash
   mvn clean install -U
   ```

3. **JUnit version conflicts**
   - `pom.xml` dosyasındaki version'ları kontrol edin
   - Maven cache'i temizleyin

### Destek

Sorularınız için:
- Issue açabilirsiniz
- README'yi detaylı inceleyin
- REST Assured [dokümantasyonuna](https://rest-assured.io/) bakabilirsiniz

---

**Happy Testing!
