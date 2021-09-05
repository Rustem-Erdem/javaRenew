package a;

import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in) ;
        int number= input.nextInt();
        int total=0;
        do{
            total+=number%10;//total begin from 0 and add the remain from the division
            number=number/10;// this part reach the number which divided by ten
            System.out.println("total= "+total+" number= "+ number);




        }
        while (number>0);
        System.out.println("total= "+total);

    }
}
