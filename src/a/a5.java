package a;

public class a5 {
    public static int plusFive(int num) {
        return num + 5;
    }

    public static int multipleSix(int num) {
        return num * 6;
    }

    public static int remainFour(int num) {
        return num % 4;
    }

    public static void main(String[] args) {

        System.out.println(remainFour(multipleSix(plusFive(70))));


    }
}
