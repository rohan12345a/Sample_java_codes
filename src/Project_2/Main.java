package Project_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        User user = login.selectUser();
        Budget budget = new Budget(user);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter expense amount (0 to exit): ");
            double amount = scanner.nextDouble();
            if (amount == 0) {
                break;
            }
            budget.addExpense(amount);
        }
        budget.printSummary();
    }
}


































