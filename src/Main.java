import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;
        final double armutKgFiyat = 2.14, elmaKgFiyat = 3.67, domatesKgFiyat = 1.11, muzKgFiyat = 0.95, patlicanKgFiyat = 5.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        patlicanKg = input.nextDouble();

        if(armutKg < 0 || elmaKg < 0 || domatesKg < 0 || muzKg < 0 || patlicanKg < 0){
            System.out.println("Negatif değer girildi. Program sonlandırıldı.");
        }else{
            toplam = (armutKg * armutKgFiyat) + (elmaKg * elmaKgFiyat) + (domatesKg * domatesKgFiyat) + (muzKg * muzKgFiyat) + (patlicanKg * patlicanKgFiyat);
            System.out.println("Toplam Tutar : " + toplam + " TL");
        }

    }
}