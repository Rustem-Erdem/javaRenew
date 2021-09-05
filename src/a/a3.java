package a;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number!");
        int number= input.nextInt();
        int fact=1;
        while (number>0){
            fact= fact*number;
            number--;
        }
        System.out.println("result :"+fact);
    }
}
