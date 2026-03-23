/**
 * MAIN CLASS: UseCase9ErrorHandlingValidation
 *
 * Use Case 9: Error Handling & Validation
 *
 * Description:
 * Demonstrates validation and exception handling.
 *
 * @version 9.0
 */

public class UseCase9ErrorHandlingValidation {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        ReservationValidator validator = new ReservationValidator();

        // Example inputs (change to test errors)
        String guestName = "Abhi";
        String roomType = "Single";

        try {

            validator.validate(guestName, roomType, inventory);

            System.out.println("Booking input is valid.");
            System.out.println("Proceeding with booking...");

        } catch (InvalidBookingException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}