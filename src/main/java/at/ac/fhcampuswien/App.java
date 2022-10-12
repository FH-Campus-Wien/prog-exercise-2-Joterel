package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        int number1 = scanner.nextInt();
        if (number1 < 0){
            System.out.println("Number 1: No number entered.");
        }
        else {
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            if (number1 > number2 && number1 > number3 && number1 > 0) {
                System.out.print("Number 1: Number 2: Number 3: The largest number is " + number1 + ".00");
            } else if (number2 > number1 && number2 > number3 && number1 > 0) {
                System.out.println("Number 1: Number 2: Number 3: The largest number is " + number2 + ".00");
            } else if (number3 > number1 && number3 > number2 && number3 > 0) {
                System.out.println("Number 1: Number 2: Number 3: The largest number is " + number3 + ".00");
            } else {
                System.out.println("Number 1: No number entered.");
            }
        }
    }


    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner.nextInt();
        int numberAll = 0;
        if(number <= 0)
            System.out.println("Invalid number!");
        for(int i = 1; i <= number; i++){
            for(int ii = 1; ii <= i; ii++){
                numberAll++;
                System.out.print(numberAll + " ");}
            System.out.print("\n");}

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int height = scanner.nextInt();
        System.out.print("c: ");
        if(height %2 == 0){
            System.out.println("Invalid number!");
            return;
        }
        char character = scanner.next().charAt(0);
        int gap = (height/2);
        for(int i = 1; i <= height/2+1; i++){
            for (int i2 = 0; i2<gap; i2++){
                System.out.print(" ");
            }
            int rhombus = i * 2 - 1;
            int z = rhombus/2 * (-1);
            for (int x = rhombus ; x<=rhombus && x != 0; x--) {
                System.out.print(""+(char) (character-Math.abs(z)));
                z++;
            }
            gap--;
            System.out.print("\n");
        }
        gap = 1;
        int i2 = 1;
        for(int i = 1; i < height/2+1; i++){
            for (int z = 0; i2>=gap && z < i2; z++){
                System.out.print(" ");
            }
            i2++;
            int sterne = height - gap*2;
            int z = sterne/2 * (-1);
            for (int x = sterne ; x<=sterne && x != 0; x--) {
                System.out.print(""+(char) (character-Math.abs(z)));
                z++;
            }
            gap++;
            System.out.print("\n");
        }
    }


    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        double mark = 1;
        double mean = 0;
        int sum = 0;
        int meter = 0;
        int negative = 0;
        System.out.print("Mark " + ++meter + ": ");
        mark=scanner.nextDouble();
        mean += mark;
        while(mark > 0){
            if(mark < 0 || mark >5 ){
                System.out.println("Invalid mark!");
                mean -= mark;
                meter--;
            } else if (mark==5) {
                negative += 1;
            }
            System.out.print("Mark " + ++meter + ": ");
            mark = scanner.nextDouble();
            if (mark!=0){
                mean = (mean + mark);
            }
        }
        if(mean==0){
            System.out.printf("Average: %.2f", mean);
            System.out.println();
            System.out.println("Negative marks: " + negative);
            return;
        }
        double meanAll = mean/((double)meter-1);
        System.out.printf("Average: %.2f", meanAll);
        System.out.println();
        System.out.println("Negative marks: " + negative);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        int happy;
        int sad = 0;
        System.out.print("n: ");
        Scanner scanner = new Scanner(System.in);
        happy = scanner.nextInt();
        while(happy >= 10) {
            while (happy > 0) {
                sad = sad + (happy % 10)*(happy % 10);
                happy = (happy / 10);
            }
            happy = sad;
            sad = 0;
        }
        if(happy == 1) {
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
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