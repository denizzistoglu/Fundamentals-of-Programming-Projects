package dart;

import java.util.Scanner;

/**
 *
 * @author deniz
 */
public class Dart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("DART GAME!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of darts to be thrown: ");
        int desirednum = input.nextInt();
        System.out.println();
        int darts = 0; int counta = 0; int countb = 0; int countc = 0; int countd = 0; int counte = 0; int countf = 0; int countg = 0; int countu = 0;
        char a;//area
        
        while (darts < desirednum) {
            double x = (Math.random() * (5 - (-5)) - 5) * 10;
            x = (int) x;
            x = (double) x / 10;

            double y = (Math.random() * (5 - (-5)) - 5) * 10;
            y = (int) y;
            y = (double) y / 10;

            if (x > 0 && y > 0) { //(+,+)
                if (x + y < 5) {
                    a = 'A';
                    counta++;
                } else if (x + y > 5) {
                    a = 'B';
                    countb++;
                } else {
                    a = 'U';
                    countu++;
                }
            } else if (x > 0 && y < 0) { //(+,-)
                a = 'F';
                countf++;
            } else if (x < 0 && y < 0) { //(-,-)
                if (x < y) {
                    a = 'D';
                    countd++;
                } else if (x > y) {
                    a = 'E';
                    counte++;
                } else {
                    a = 'U';
                    countu++;
                }
            } else if (x < 0 && y > 0) { //(-,+)
                if (-1 < x + y && x + y < 1) {
                    a = 'C';
                    countc++;
                } else if (-1 > x + y || x + y > 1) {
                    a = 'G';
                    countg++;
                } else {
                    a = 'U';
                    countu++;
                }
            } else {
                a = 'U';
                countu++;
            }
            darts++;
            System.out.println("Dart "+darts+" :");
            System.out.println("Coordinates: ("+x+","+y+")");
            System.out.println("Region: "+a);
            System.out.println();
        }
        System.out.println("Region statistics: ");
        
        System.out.println("A: " + counta + " darts  (" + (double) counta / desirednum * 100 +"%)" );

        System.out.println("B: " + countb + " darts  (" + (double) countb / desirednum * 100 +"%)");

        System.out.println("C: " + countc + " darts  (" + (double) countc / desirednum * 100 +"%)");

        System.out.println("D: " + countd + " darts  (" + (double) countd / desirednum * 100 +"%)");

        System.out.println("E: " + counte + " darts  (" + (double) counte / desirednum * 100 +"%)");

        System.out.println("F: " + countf + " darts  (" + (double) countf / desirednum * 100 +"%)");

        System.out.println("G: " + countg + " darts  (" + (double) countg / desirednum * 100 +"%)");

        System.out.println("Undecided: " + countu + " darts " + "(" + (double) countu / desirednum * 100 +"%)");

    }

}
