import java.util.Scanner;

public class EmployeeView {
    public void home() {
        var scanner = new Scanner(System.in);
        var choice = 0;
        do {
            menu();
            choice = Integer.parseInt(scanner.nextLine());
            routes(choice);
        } while (choice != 0);
        scanner.close();
    }

    private void menu() {
        System.out.println("PRESS> 1 Add employee");
        System.out.println("PRESS> 2 View employee");
        System.out.println("PRESS> 0 For exit");
        System.out.println("Enter your choice");
    }

    private void routes(int choice) {
        switch (choice) {
            case 0 -> System.out.println("Exit");
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Hi");
            default -> System.out.println("Invalid choice!!!");
        }
    }
}