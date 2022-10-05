package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        int number = scanner.nextInt();
        while(number > 0){
            scanner.nextInt();
        }
        System.out.print("The largest number is " + number);

    }


    //todo Task 2
    public void stairs() {
        // input your solution here
        final int ROWS = 4;
        int number = 1;

        System.out.println("n: " + number);
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < ROWS - row; col++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
            final int ROWS = 6;
        for (int row = 1; row <= ROWS; row++){
            for (int col = ROWS; col > row; col--) {
                System.out.print(" ");
            }
            for (int col = 0; col < row*2-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        int sum = 0;
        double average;
        int count = 0;
        int input;
        Scanner scan = new Scanner(System.in);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}