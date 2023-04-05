package Project_2;

import java.util.Scanner;

public class Login {
    private User[] users;
    private Scanner scanner;

    public Login() {
        scanner = new Scanner(System.in);
        System.out.print("Enter number of users: ");
        int numUsers = scanner.nextInt();
        users = new User[numUsers];
        for (int i = 0; i < numUsers; i++) {
            System.out.printf("Enter details for user %d:\n", i + 1);
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Occupation: ");
            String occupation = scanner.next();
            System.out.print("Income per month: ");
            double income = scanner.nextDouble();
            users[i] = new User(name, age, occupation, income);
        }
    }

    public User selectUser() {
        System.out.println("Select user:");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("%d. %s\n", i + 1, users[i].getName());
        }
        int choice = scanner.nextInt();
        return users[choice - 1];
    }
}

