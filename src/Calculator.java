import Application.Calc;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int menu;
        do {
            System.out.println("MENU:");
            System.out.println("#1 SUM:");
            System.out.println("#2 SUBTRACTION:");
            System.out.println("#3 MULTIPLICATION:");
            System.out.println("#4 DIVISION:");
            System.out.println("#5 EXPONENTIATION:");
            System.out.println("#6 RADICATION:");
            System.out.println("#7 SAIR:");
            System.out.println();


            menu = sc.nextInt();
            System.out.println();

            double a = 0, b= 0;

            if (menu!=7 ) {
                System.out.print("Enter the first value: ");
                a = sc.nextDouble();
                System.out.println();
            }
            if (menu>=1 && menu<=5 ){
                System.out.print("Enter the second value: ");
                b = sc.nextDouble();
                System.out.println();
            }


            switch (menu) {
                case 1:
                    System.out.println("Result: " + String.format("%.2f", Calc.Sum(a, b)));
                    System.out.println();
                    break;


                case 2:
                    System.out.println("Result: " + String.format("%.2f", Calc.Subtraction(a, b)));
                    System.out.println();

                    break;


                case 3:
                    System.out.println("Result: " + String.format("%.2f", Calc.Multiplication(a, b)));
                    System.out.println();

                    break;

                case 4:
                    while (b <= 0) {
                        System.out.println("Impossible option, try again: ");
                        b = sc.nextDouble();
                        System.out.println();
                    }
                    System.out.println("Result: " + String.format("%.2f", Calc.Division(a, b)));
                    System.out.println();

                    break;

                case 5:
                    System.out.println("Result: " + String.format("%.2f", Calc.Exponentiation(a, b)));
                    System.out.println();
                    break;

                case 6:
                    while (a<0){
                        System.out.println("Cannot perform this operation with negative numbers, try again: ");
                        a = sc.nextDouble();
                    }
                    System.out.println("Result: " + String.format("%.2f", Calc.Radication(a)));
                    System.out.println();

                    break;
                }




        } while (menu != 7);

        System.out.println("Thanks for use !");

    }
}
