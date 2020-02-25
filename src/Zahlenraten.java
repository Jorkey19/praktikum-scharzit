import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {

    public static void main(String[] args) {
        int a;


        Random rand = new Random();

        // Obtain a number between [0 - 99].
        int n = rand.nextInt(100);
// Add 1 to the result to get a number from the required range
// (i.e., [1 - 50]).
        System.out.println("Bitte gib eine Zahle zwischen 1 und 100 ein.");
        n += 1;

      do {

          Scanner in = new Scanner(System.in);
          a = in.nextInt();
          if (a == n) {
              System.out.println("Richtig die Zahl ist " + a);
          } else if (a < n) {
              System.out.println("Die Zahl ist größer als " + a);
          } else if (a > n) {
              System.out.println("Die Zahl ist kleiner als " + a);
          }
      }while(a!=n);

System.out.println("Die Zahl ist"+n);







    }




}
