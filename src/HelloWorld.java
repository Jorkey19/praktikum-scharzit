import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        b = 31;
        a = 17;
        a = 23;
        a = a + b;
        System.out.println("a=" + a);
        a = 20;
        c = 12;
        d = a + b + c;
        System.out.println("a+b+c=" + d);

        System.out.println("Bitte gebe eine Zahl ein");
        Scanner in = new Scanner(System.in);

        a = in.nextInt();


        if (a < 15) {
            System.out.println("A ist kleiner als 15");
        } else {
            System.out.println("A ist größergleich 15");
        }


        if (a >= 15) {
            System.out.println("A ist größergleich 15");
        }

        System.out.println("HELLO WORLD");

        a = 0;
        for (int zahl = 1; zahl <= 1000; zahl = zahl + 1) {


            System.out.println(zahl);


        }


        int i=0;
        do{
            System.out.println(i);
            i=i+1;

        }while(i<100);





    }
}