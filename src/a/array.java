package a;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        int[] arr1={10,50,4,7,29};
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("data : "+arr1[i]);
        int[] arr2=new int[6];
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]= input.nextInt();

        }
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);

        }

        }


    }

