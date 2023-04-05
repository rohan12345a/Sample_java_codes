package Project_2;

import java.util.Calendar;
import java.util.Scanner;
public class Budget {
    private User user;
    private double income;
    private double limit;
    private double[] expenses;
    private int currentDayOfMonth;

    public Budget(User user) {
        this.user = user;
        this.income = getUserIncome();
        this.limit = getSpendingLimit();
        this.expenses = new double[getCurrentDayOfMonth()];
        this.currentDayOfMonth = getCurrentDayOfMonth();
    }

    private double getUserIncome() {
        System.out.print("Enter your monthly income: ");
        return new Scanner(System.in).nextDouble();
    }

    private double getSpendingLimit() {
        System.out.print("Enter your spending limit for this month: ");
        return new Scanner(System.in).nextDouble();
    }

    private int getCurrentDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public void addExpense(double expense) {
        int day = getCurrentDayOfMonth() - 1;
        expenses[day] += expense;
        double totalExpenses = getTotalExpenses();
        if (totalExpenses > limit) {
            double overspend = totalExpenses - limit;
            double dailyLimit = (limit - getMonthToDateExpenses()) / (30 - currentDayOfMonth + 1);
            System.out.println("WARNING: You have exceeded your spending limit by " + overspend + " this month. "
                    + "To stay within your budget, you should not spend more than " + dailyLimit + " per day from now on.");
        }
    }

    private double getMonthToDateExpenses() {
        double total = 0.0;
        for (int i = 0; i < currentDayOfMonth - 1; i++) {
            total += expenses[i];
        }
        return total;
    }

    private double getTotalExpenses() {
        double total = 0.0;
        for (double expense : expenses) {
            total += expense;
        }
        return total;
    }

    public void printSummary() {
        System.out.println();
        System.out.println("Budget Summary for " + user.getName());
        System.out.println("-------------------------------");
        System.out.println("Monthly Income: $" + income);
        System.out.println("Spending Limit: $" + limit);
        System.out.println("Total Expenses: $" + getTotalExpenses());
        System.out.println("Month-to-Date Expenses: $" + getMonthToDateExpenses());
        double remaining = limit - getMonthToDateExpenses();
        if (remaining >= 0) {
            System.out.println("Remaining Budget: $" + remaining);
        } else {
            System.out.println("Overspent: $" + Math.abs(remaining));
        }
    }
}

