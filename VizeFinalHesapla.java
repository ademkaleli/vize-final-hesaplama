package vizefinalhesapla;

import java.util.Scanner;
import java.util.InputMismatchException;

/* =========================================================
 * Ders: Algoritma ve Programlamaya Giriş
 * Konu: Vize-Final Ortalama ve Geçme Notu Hesaplama
 * Öğrenci: Adem Kaleli (2615501083)
 * =========================================================
 */

public class VizeFinalHesapla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== VIZE - FINAL GECME NOTU HESAPLAYICI (JAVA) ===\n");

        try {
            // 1. GİRDİ (INPUT)
            System.out.print("Vize notunu giriniz (0-100): ");
            double vize = scanner.nextDouble();

            System.out.print("Final notunu giriniz (0-100): ");
            double finalNotu = scanner.nextDouble();

            // 2. DOĞRULAMA (VALIDATION)
            if (vize < 0 || vize > 100 || finalNotu < 0 || finalNotu > 100) {
                System.out.println("\n[HATA] Notlar 0 ile 100 arasinda olmalidir!");
                return;
            }

            // 3. İŞLEM (PROCESS)
            double ortalama = (vize * 0.40) + (finalNotu * 0.60);

            // 4. ŞART VE KARAR (DECISION)
            String durum;
            if (ortalama >= 50 && finalNotu >= 50) {
                durum = "GECTI (Basarili)";
            } else if (finalNotu < 50) {
                durum = "KALDI (Final Baraji Asilamadi)";
            } else {
                durum = "KALDI (Ortalama Yetersiz)";
            }

            // 5. ÇIKTI (OUTPUT)
            System.out.println("\n-----------------------------------");
            System.out.printf("Vize Notu      : %.1f\n", vize);
            System.out.printf("Final Notu     : %.1f\n", finalNotu);
            System.out.printf("Ortalama       : %.2f\n", ortalama);
            System.out.println("Durum          : " + durum);
            System.out.println("-----------------------------------");

        } catch (InputMismatchException e) {
            System.out.println("\n[HATA] Lutfen gecerli sayisal bir deger giriniz!");
        } finally {
            scanner.close();
        }
    }
}