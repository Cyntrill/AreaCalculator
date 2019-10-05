package AreaCalc;

import java.util.Scanner;

public class AreaCalc
{
    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);

        System.out.println("Booted up AreaCalc. What do you want to find?");
        System.out.println("(Enter choice #)");
        System.out.println("1. The Area of an Equilateral Triangle");
        System.out.println("2. The Area of a Polygon using Apothem & Perimeter");

        char choice = reader.next().charAt(0);

        switch (choice)
        {
            case '1':
                // Area of Equilateral Triangle
                System.out.println("Enter the side: ");
                double side = reader.nextInt();
                double areaTri = (Math.pow(side, 2) * Math.pow(3, 0.5)) / 4;
                System.out.println("The area of this equilateral triangle is " + areaTri);
                break;

            case '2':
                // Area = Apothem * Perimeter // (Polygon Area)
                System.out.print("Enter the apothem: ");
                double apoth = reader.nextInt();

                System.out.print("Enter the perimeter: ");
                double perim = reader.nextInt();

                double area = apoth * perim;
                System.out.print("The area is " + area + ".");
                break;

        }

    }
}
