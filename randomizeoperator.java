/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizeoperator;

import java.util.Scanner;

/**
 *
 * @author deniz
 */
public class randomizeoperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = (int) (Math.random() * 10);
        int B = (int) (Math.random() * 10);
        int n = (int) ((Math.random() * (5 - 1)) + 1);
        System.out.println(n);
        int countc = 0;
        int countw = 0;

        switch (n) {
            case 1:
                System.out.println((A + " + " + B) + " ? ");
                int answer1 = input.nextInt();
                if (answer1 == A + B) {
                    System.out.println(" Correct !");
                    countc++;
                } else {
                    System.out.println(" Wrong !");
                    countw++;
                }
                break;
            case 2:
                System.out.println((A + " - " + B) + " ? ");
                int answer2 = input.nextInt();
                if (answer2 == A - B) {
                    System.out.println(" Correct !");
                    countc++;
                } else {
                    System.out.println(" Wrong !");
                    countw++;
                }
                break;
            case 3:
                System.out.println((A + " * " + B) + " ? ");
                int answer3 = input.nextInt();
                if (answer3 == A * B) {
                    System.out.println(" Correct !");
                    countc++;
                } else {
                    System.out.println(" Wrong !");
                    countw++;
                }
                break;
            case 4:
                System.out.println((A + " / " + B) + " ? ");
                int answer4 = input.nextInt();
                if (answer4 == A / B) {
                    System.out.println("Correct !");
                    countc++;
                } else {
                    System.out.println("Wrong !");
                    countw++;
                }
                break;

        }


        
        
        
        
    }
    
}
