package a;

import java.util.Locale;
import java.util.Scanner;

public class a2 {
    public static void main(String[] args, Object locale) {
        Scanner input=new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("enter a number:  ");
        double num =input.nextDouble();
        System.out.println(num*7);

    }

    private static class US {
    }
}
