package numberOfAnimal;

import java.util.Scanner;

public class AnimalOdev {

    static int  TavukSayisi, InekSayisi, KeciSayisi, BalikSayisi;

    public static void main(String[] args) {

        BacakSayisi();
    }
    public static void BacakSayisi() {

        System.out.println("Lutfen Tavuk Sayisini giriniz ");

        Scanner scan = new Scanner(System.in);
        TavukSayisi = scan.nextInt();

        System.out.println("Lutfen Inek Sayisini giriniz ");
        InekSayisi = scan.nextInt();

        System.out.println("Lutfen Keci Sayisini giriniz ");
        KeciSayisi = scan.nextInt();

        System.out.println("Lutfen Balik Sayisini giriniz ");
        BalikSayisi = scan.nextInt();

        int	ToplamBacakSayisi = TavukSayisi*2 + InekSayisi*4 + KeciSayisi*4;

        int ToplamHayvanSayisi = TavukSayisi + InekSayisi +	KeciSayisi + BalikSayisi;

        System.out.println("Toplam Hayvan Sayisi= "+ToplamHayvanSayisi);
        System.out.println("Toplam Bacak Sayisi= "+ToplamBacakSayisi);

        System.out.println("Tekrar hayvan sayisi girmek icin 1 bitirmek icin 2 yaziniz");

        int num = scan.nextInt();

        if(num==1) {
            BacakSayisi();
        }else if(num==2) {
            System.out.println("Tesekkurler...");
        }else {
            System.out.println("Hatali giris yaptiniz");
            BacakSayisi();
        }
    }
}
