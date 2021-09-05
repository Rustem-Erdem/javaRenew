package a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("1.sayıyı girin:");
            double bolunen = sc.nextDouble();
            System.out.println("2.sayıyı girin:");
            double bolen=sc.nextDouble();
            double sonuc=bolunen/bolen;
            System.out.println("Sonuç="+sonuc);
        } catch (InputMismatchException e) {
            System.out.println("Lütfen sadece sayı giriniz.");
        }
        finally{
            System.out.println("İşlem sonlandı.");
        }
    }
}
