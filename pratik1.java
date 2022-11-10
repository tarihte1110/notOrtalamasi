import java.util.Scanner;

public class pratik1 {
    public static void main(String [] args) {
        Scanner k = new Scanner(System.in); //alt+enter import scanneri ekler
        int turkce, mat, fizik, kimya, biyoloji;

        System.out.println("matematik notunuzu giriniz:");
        mat = k.nextInt();

        System.out.println("fizik notunuzu giriniz:");
        fizik = k.nextInt();

        System.out.println("kimya notunuzu giriniz:");
        kimya = k.nextInt();

        System.out.println("türkçe notunuzu giriniz:");
        turkce = k.nextInt();

        System.out.println("biyoloji notunuzu giriniz:");
        biyoloji = k.nextInt();

        int toplam = fizik + biyoloji + mat + kimya + turkce;
        double ortalama = toplam / 5;

        if(ortalama>=50){
            System.out.println("Ortalamanız: "+ortalama+"\nTebrikler Geçtiniz !");
        }
        else if(ortalama<=45 && ortalama <50){
            System.out.println("Sorumlu Geçtiniz !");
        }
        else{
            System.out.println("Maalesef Kaldınız !");
        }


 }
}
