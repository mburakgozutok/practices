import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        //Değişkenleri Oluştur
        int mat, fiz, kim, tur, tar, muz;

        //Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        //Kullanıcı değerleri
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        tur = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tar = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muz = inp.nextInt();

        // Sonuç
        int toplam = (mat + fiz + kim + tur + tar + muz);
        double sonuc = (toplam / 6.0);
        System.out.println("Ortalamaniz: " + sonuc);

        System.out.println(sonuc >= 60 ? "Gectiniz" : "Kaldiniz");
    }
}