package restaurantmanager;
import java.util.*;

public class AdminService {
    public static void handleAdminService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Admin Panel:");
        System.out.println("1. View Staff Info");
        System.out.println("2. View Staff Time Slots");
        System.out.println("3. View Staff Salary");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Staff: Ramu (Waiter), Sita (Cook), John (Manager)");
                break;
            case 2:
                System.out.println("Ramu: 10AM-6PM | Sita: 8AM-4PM | John: 12PM-8PM");
                break;
            case 3:
                System.out.println("Ramu: ₹15,000 | Sita: ₹18,000 | John: ₹25,000");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

