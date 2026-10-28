# 🎓 Vize-Final Ortalama ve Geçme Notu Hesaplayıcı (Java & Web)

Bu proje, **Algoritma ve Programlamaya Giriş** dersi ödevi kapsamında geliştirilmiş; klavyeden girilen Vize (%40) ve Final (%60) notlarına göre ortalama ve geçme/kalma durumunu hesaplayan Java uygulaması ve canlı web arayüzüdür.

🚀 **Canlı Web Uygulaması:** [ademkaleli.github.io/vize-final-hesaplama](https://ademkaleli.github.io/vize-final-hesaplama/)

---

## 👤 Öğrenci Bilgileri

* **Adı Soyadı:** Adem Kaleli
* **Öğrenci No:** 2615501083
* **Ders:** Algoritma ve Programlamaya Giriş
* **Geliştirme Ortamı:** Apache NetBeans IDE / Java

---

## 🧠 Algoritma ve Sözde Kod (Pseudocode)

```text
1. BAŞLA
2. Oku vize, final
3. EĞER (vize < 0 VEYA vize > 100 VEYA final < 0 VEYA final > 100) İSE
       YAZ ("Hata: Notlar 0-100 arasında olmalıdır!")
       GİT Adım 7
   BİTİR_EĞER
4. ortalama = (vize * 0.40) + (final * 0.60)
5. EĞER (ortalama >= 50 VE final >= 50) İSE
       YAZ ("Durum: GEÇTİ")
   DEĞİLSE
       YAZ ("Durum: KALDI")
   BİTİR_EĞER
6. YAZ ortalama
7. BİTİR
