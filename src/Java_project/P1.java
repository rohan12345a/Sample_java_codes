//package Java_project;
//
////public class P1 {
////    public static void main(String[] args) {
////        System.out.println("We will do it");
////    }
////}
//
//import java.util.Scanner;
//
//public class P1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking user input for monthly income
//        System.out.print("Enter your monthly income: ");
//        double income = scanner.nextDouble();
//
//        // Creating an instance of the Budget class
//        Budget budget = new Budget(income);
//
//        // Taking user input for daily expenses and adding them to the Budget object
//        for (int i = 1; i <= 30; i++) {
//            System.out.print("Enter your expenses for day " + i + ": ");
//            double expenses = scanner.nextDouble();
//            boolean exceededAverage = budget.addExpense(expenses);
//
//            // Checking if the user has exceeded their average daily spend and providing a message
//            if (exceededAverage) {
//                System.out.println("You have exceeded your average daily spend on day " + i + "!");
//                System.out.println("Your daily budget was " + budget.getDailyBudget() + " and you have spent " + budget.getAverageDailyExpense() + " per day on average.");
//                System.out.println("You should consider reducing your expenses.");
//                System.out.println("Please enter your expenses for the remaining " + (30-i) + " days.");
//            }
//        }
//
//        // Checking if the user has exceeded their budget and providing suggestions accordingly
//        if (budget.getRemainingBudget() < 0) {
//            System.out.println("You have exceeded your budget!");
//            System.out.println("Your daily budget was " + budget.getDailyBudget() + " and you have spent " + budget.getAverageDailyExpense() + " per day on average.");
//            System.out.println("You should consider reducing your expenses.");
//        } else {
//            System.out.println("You have managed to stay within your budget!");
//            System.out.println("Your daily budget was " + budget.getDailyBudget() + " and you have spent " + budget.getAverageDailyExpense() + " per day on average.");
//            System.out.println("You can consider saving or investing the remaining " + budget.getRemainingBudget() + ".");
//        }
//    }
//}
//
//class Budget {
//    private double income;
//    private double totalExpenses;
//    private double dailyBudget;
//    private double averageDailyExpense;
//    private int days;
//
//    // Constructor for the Budget class
//    public Budget(double income) {
//        this.income = income;
//        this.totalExpenses = 0;
//        this.dailyBudget = income / 30;
//        this.averageDailyExpense = 0;
//        this.days = 0;
//    }
//
//    // Method to add daily expenses to the Budget object
//    public boolean addExpense(double expenses) {
//        this.totalExpenses += expenses;
//        this.days++;
//        this.averageDailyExpense = this.totalExpenses / this.days;
//
//        // Checking if the user has exceeded their average daily spend and returning a boolean value
//        if (this.averageDailyExpense < this.dailyBudget) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//    // Method to get the remaining budget
//    public double getRemainingBudget() {
//        return this.income - this.totalExpenses;
//    }
//
//    // Method to get the daily budget
//    public double getDailyBudget() {
//        return this.dailyBudget;
//    }
//
//    // Method to get the average daily expense
//    public double getAverageDailyExpense() {
//        return this.averageDailyExpense;
//    }
//}

