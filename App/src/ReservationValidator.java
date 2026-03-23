/**
 * CLASS: ReservationValidator
 *
 * Use Case 9: Error Handling & Validation
 *
 * Description:
 * Validates booking requests before processing.
 * All validation logic is centralized.
 *
 * @version 9.0
 */

public class ReservationValidator {

    /**
     * Validates booking input
     */
    public void validate(
            String guestName,
            String roomType,
            RoomInventory inventory
    ) throws InvalidBookingException {

        // Validate guest name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty");
        }

        // Validate room type
        if (roomType == null || roomType.trim().isEmpty()) {
            throw new InvalidBookingException("Room type cannot be empty");
        }

        // Validate valid room type
        if (!inventory.getRoomAvailability().containsKey(roomType)) {
            throw new InvalidBookingException("Invalid room type selected");
        }

        // Validate availability
        if (inventory.getRoomAvailability().get(roomType) <= 0) {
            throw new InvalidBookingException("No rooms available for selected type");
        }
    }
}
