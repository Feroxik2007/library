import java.util.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        String member;
        String code;
        String name;
        String read;
        String register;
        String firstName;
        String lastName;
        String phone;

        ArrayList<Integer> cody = new ArrayList<>();
        cody.add(100);
        cody.add(120);
        cody.add(140);

        Scanner scanner = new Scanner(System.in);
        File file = new File("Sigma.txt");

        System.out.println("Welcome to a library!");
        System.out.print("Please enter your name:");
        name = scanner.nextLine();
        System.out.print("Are you a member? ");
        member = scanner.nextLine();

        if (member.equals("Yes")) {
            System.out.println("What is your code? ");
            code = scanner.nextLine();
            if (code.equals("120") || code.equals("100") || code.equals("140") || code.equals("150")) {
                System.out.println("Welcome " + name);
                System.out.println("What books you are trying to read? We got these options: HarryPotter, Hobbit, StrangerThings");
                read = scanner.nextLine();
                if (read.equals("HarryPotter")) {
                    System.out.println("Here: Harry Potter je sigma");
                } else if (read.equals("Hobbit")) {
                    System.out.println("Hobbit je sigma");
                } else if (read.equals("StrangerThings")) {
                    System.out.println("Stranger things je tiez sigma!");
                }
            } else {
                System.out.println("You are not a member!");
            }
        } else if (member.equals("No")) {
            System.out.println("Do you wanna register?");
            register = scanner.nextLine();
            if (register.equals("Yes")) {
                System.out.println("I will need some of your information:");
                System.out.println("What is your first name? ");
                firstName = scanner.nextLine();
                System.out.println("What is your last name? ");
                lastName = scanner.nextLine();
                System.out.println("What is your phone number? ");
                phone = scanner.nextLine();
                System.out.println("You are registered:) here is your special code: 150");

                try {
                    FileWriter writer = new FileWriter("Sigma.txt");
                    writer.write("First name: " + firstName + "\n");
                    writer.write("Last name: " + lastName + "\n");
                    writer.write("Telephone: " + phone + "\n");
                    writer.close();
                } catch (Exception e) {
                    System.out.println("Error");
                }
            }
        }
    }
}