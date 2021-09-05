package a;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> bands =new ArrayList<String>();
        int[] arr={4,3,5,8,97,13,2};


        bands.add("midlake");
        bands.add("lake of tears");
        bands.add("poets of fall");

        bands.add("iron maiden");
        bands.remove(3);


//        System.out.println(bands.get(0));
//        System.out.println(bands.get(1));
//        System.out.println(bands.get(2));
//        System.out.println(bands.size());
        for (int i = 0; i <bands.size() ; i++) {
            System.out.println(i+" "+bands.get(i));

        }
        for(String s:bands){ // for each loops  for string
            System.out.println(s);
        }
        for (int a:arr){
            System.out.println(a);
        }
    }
}
