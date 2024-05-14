/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsproject;

import java.util.Scanner;



/**
 *
 * @author deniz
 */
public class Questionsproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetics Exercise Program!");
        System.out.println("You have 90 seconds to answer as many questions as possible.");
        System.out.println("Use java arithmetic precedence rules to find answers!");
        System.out.println("Press q to quit or any key to start...");
        char key = input.next().charAt(0);
        long startingtime = time();
        
        level1(startingtime);
        
        
        //1stars 2time 3random 4random 5key 65te bir  7goodmesseges 
        //System.out.println("wrong:"+countw);
    }
    public static long time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        return totalSeconds;

    }
    public static void level1(long starting) {
        Scanner input = new Scanner(System.in);
        int countc = 0;
        int countw = 0;
        int questions = countc + countw ;

        while (time() - starting < 10) {
            int A = (int) (Math.random() * 10);
            int B = (int) (Math.random() * 10);
            int n = (int) ((Math.random() * (5 - 1)) + 1);
            switch (n) {
            case 1:
                System.out.println((A + " + " + B) + " ? ");
                int answer1 = input.nextInt();
                if (answer1 == A + B) {
                    System.out.println("Correct !");
                    countc++;
                } else {
                    System.out.println("Wrong !");
                    countw++;
                }
                break;
            case 2:
                System.out.println((A + " - " + B) + " ? ");
                int answer2 = input.nextInt();
                if (answer2 == A - B) {
                    System.out.println("Correct !");
                    countc++;
                } else {
                    System.out.println("Wrong !");
                    countw++;
                }
                break;
            case 3:
                System.out.println((A + " * " + B) + " ? ");
                int answer3 = input.nextInt();
                if (answer3 == A * B) {
                    System.out.println("Correct !");
                    countc++;
                } else {
                    System.out.println("Wrong !");
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
        int correctanswers = countc ;
        int wronganswers = countw ;
        questions = countc + countw;
        System.out.println("Correct answers: "+correctanswers);
        System.out.println("Wrong answers: "+wronganswers);
        System.out.println("Questions: "+questions);
        String lev1 = "correctanswers";
            
        
        
    }
    public static void level2(int starting) {
        Scanner input = new Scanner(System.in);
        while (time() - starting < 90) {
            int A = (int) (Math.random() * 10);
            int B = (int) (Math.random() * 10);
            int C = (int) (Math.random() * 10);
            int n = (int) ((Math.random() * (5 - 1)) + 1);
            int countc2 = 0;
            int countw2 = 0;

            switch (n) {
                case 1://+
                    int x = (int) ((Math.random() * (9 - 5)) + 5);
                    switch (x) {
                        case 5:
                            System.out.println(A + "+" + B + "+" + C + "?");
                            int answer5 = input.nextInt();
                            if (answer5 == A + B + C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 6:
                            System.out.println(A + "+" + B + "-" + C + "?");
                            int answer6 = input.nextInt();
                            if (answer6 == A + B - C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 7:
                            System.out.println(A + "+" + B + "*" + C + "?");
                            int answer7 = input.nextInt();
                            if (answer7 == A + B * C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 8:
                            System.out.println(A + "+" + B + "/" + C + "?");
                            int answer8 = input.nextInt();
                            if (answer8 == A + B / C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                    }
                case 2://-
                    int y = (int) ((Math.random() * (13 - 9)) + 9);
                    System.out.println(y);
                    switch (y) {
                        case 9:
                            System.out.println(A + "-" + B + "+" + C + "?");
                            int answer9 = input.nextInt();
                            if (answer9 == A - B + C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 10:
                            System.out.println(A + "-" + B + "-" + C + "?");
                            int answer10 = input.nextInt();
                            if (answer10 == A - B - C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 11:
                            System.out.println(A + "-" + B + "*" + C + "?");
                            int answer11 = input.nextInt();
                            if (answer11 == A - B * C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 12:
                            System.out.println(A + "-" + B + "/" + C + "?");
                            int answer12 = input.nextInt();
                            if (answer12 == A - B / C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                    }
                case 3://*
                    int z = (int) ((Math.random() * (17 - 13)) + 13);
                    System.out.println(z);
                    switch (z) {
                        case 13:
                            System.out.println(A + "*" + B + "+" + C + "?");
                            int answer13 = input.nextInt();
                            if (answer13 == A * B + C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 14:
                            System.out.println(A + "*" + B + "-" + C + "?");
                            int answer14 = input.nextInt();
                            if (answer14 == A * B - C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 15:
                            System.out.println(A + "*" + B + "*" + C + "?");
                            int answer15 = input.nextInt();
                            if (answer15 == A + B * C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 16:
                            System.out.println(A + "*" + B + "/" + C + "?");
                            int answer16 = input.nextInt();
                            if (answer16 == A * B / C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                    }
                case 4:///
                    int d = (int) ((Math.random() * (21 - 17)) + 17);
                    System.out.println(d);
                    switch (d) {
                        case 17:
                            System.out.println(A + "/" + B + "+" + C + "?");
                            int answer17 = input.nextInt();
                            if (answer17 == A / B + C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 18:
                            System.out.println(A + "/" + B + "-" + C + "?");
                            int answer18 = input.nextInt();
                            if (answer18 == A / B - C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 19:
                            System.out.println(A + "/" + B + "*" + C + "?");
                            int answer19 = input.nextInt();
                            if (answer19 == A / B * C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;
                        case 20:
                            System.out.println(A + "/" + B + "/" + C + "?");
                            int answer20 = input.nextInt();
                            if (answer20 == A / B / C) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Wrong !");
                                countw2++;
                            }
                            break;

                }
        }        
        }
    }
}
