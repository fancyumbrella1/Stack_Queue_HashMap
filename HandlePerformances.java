import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformances {
    Scanner scanner = new Scanner(System.in);
    Queue<Performance> performances = new LinkedList<>();

    public void handlePerformances() {
        int option;
        do {
            System.out.println("\n1. Add performances");
            System.out.println("2. Display all the performances");
            System.out.println("3. Start the performances");
            System.out.println("4. QUIT");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("How many performances needs to be added?");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    addPerformances(num);
                    break;
                case 2:
                    displayPerformances();
                    break;
                case 3:
                    startPerformance();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (option != 4);
    }

    public void addPerformances(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the performance ID of the performance " + (i + 1) + ": ");
            String performanceID = scanner.nextLine();
            System.out.println("Enter the name of the performance " + (i + 1) + ": ");
            String performanceName = scanner.nextLine();
            System.out.println("Enter the lead name of the performance " + (i + 1) + ": ");
            String performanceLeadName = scanner.nextLine();
            performances.add(new Performance(performanceID, performanceName, performanceLeadName));
        }
    }

    public void displayPerformances() {
        if (performances.isEmpty()) {
            System.out.println("No performances have been added");
            return;
        }
        System.out.println("The details of the performances are: ");
        for (Performance performance : performances) {
            System.out.println("\nPerformance ID: " + performance.getPerformanceID());
            System.out.println("Performance Name: " + performance.getPerformanceName());
            System.out.println("Performance Lead Name: " + performance.getPerformanceLeadName() + '\n');
        }
    }

    public void startPerformance() {
        if (performances.isEmpty()) {
            System.out.println("No performances have been added");
            return;
        }
        Performance performance = performances.poll();
        System.out.println("The performance " + performance.getPerformanceName() + " has started");
    }
}