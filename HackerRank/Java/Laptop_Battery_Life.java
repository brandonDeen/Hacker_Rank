import java.util.Scanner;


public class Laptop_Battery_Life {
//https://www.hackerrank.com/challenges/battery
   private static Scanner in;

   public static void main(String[] args) {

      in = new Scanner(System.in);
      double timp_incarcare = in.nextDouble();

      if (timp_incarcare >= 4.0) {
        System.out.println("8.0");
      }
      else {
        System.out.println(timp_incarcare * 2);
      }

   }

}
