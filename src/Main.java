import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        // comment

        /* multi-line comment */

        // System.out.println("Hello");

        // 2 steps to creating a variable
        // 1. declare the variable
        // 2. assign a value to the variable

        int age1; // declaration
        age1 = 31; // assignment
        int age = 30; // declaration and assignment's in one line

        // System.out.println(age);
        // System.out.println(age1);

        int year = 2025;
        // System.out.println(year);
        // System.out.println("The year is " + year);

        double price = 4.99;
        double gpa = 3.5;
        // System.out.println("My gpa is " + gpa);

        char letter = 'A';
        // System.out.println(letter);

        boolean isMale = true;
        // System.out.println(isMale);

        boolean isFemale = false;
        // System.out.println(isFemale);

        String name = "Mohamed";
        // System.out.println(name);

        String address = "123 Main St";
        // System.out.println(address);

        // System.out.println("My name is " + name + " and I live at " + address);

        // System.out.println("My name is " + name + " and I live at " + address + " and I am " + age + " years old");

        Scanner scanner = new Scanner(System.in);

        /* System.out.print("Enter your name: ");

        String nameInput = scanner.nextLine();

        System.out.print("Enter your age: ");

        int ageInput = scanner.nextInt();

        System.out.print("Enter your gpa: ");

        double gpaInput = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");

        boolean isStudent = scanner.nextBoolean();

        System.out.print("Hello " + nameInput);
        System.out.println(" You are " + ageInput + " years old");
        System.out.println("Your gpa is " + gpaInput);

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        } */

        // common issues

        /* System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // sometimes this is needed to ability of the scanner to read the next line

        System.out.print("Enter your favorite color: " );
        String color = scanner.next();

        System.out.println("Your number is " + number);
        System.out.println("Your favorite color is " + color); */

        // calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + " cm");

        scanner.close();

    }
}
