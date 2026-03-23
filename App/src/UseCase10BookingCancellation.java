/**
 * MAIN CLASS: UseCase10BookingCancellation
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Description:
 * Demonstrates safe cancellation and inventory restoration.
 *
 * @version 10.0
 */

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation & Rollback");

        RoomInventory inventory = new RoomInventory();
        CancellationService cancellationService = new CancellationService();

        // Simulate confirmed bookings
        cancellationService.registerBooking("Single-1", "Single");
        cancellationService.registerBooking("Double-1", "Double");
        cancellationService.registerBooking("Suite-1", "Suite");

        // Cancel bookings
        cancellationService.cancelBooking("Single-1", inventory);
        cancellationService.cancelBooking("Suite-1", inventory);

        // Show rollback history
        cancellationService.showRollbackHistory();
    }
}
