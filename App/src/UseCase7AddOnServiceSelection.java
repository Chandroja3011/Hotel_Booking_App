/**
 * MAIN CLASS: UseCase7AddOnServiceSelection
 *
 * Use Case 7: Add-On Service Selection
 *
 * Description:
 * Demonstrates how optional services
 * can be added after booking confirmation.
 *
 * @version 7.0
 */

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        // Example confirmed reservation ID
        String reservationId = "Single-1";

        AddOnServiceManager manager = new AddOnServiceManager();

        // Create services
        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 1000);

        // Attach services
        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);

        // Calculate total cost
        double totalCost =
                manager.calculateTotalServiceCost(reservationId);

        System.out.println("Reservation  " +
                ": " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}
