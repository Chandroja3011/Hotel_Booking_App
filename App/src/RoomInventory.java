import java.util.HashMap;
import java.util.Map;

/**
 * CLASS: RoomInventory
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class acts as the single source of truth
 * for room availability in the hotel.
 *
 * Room pricing and characteristics are obtained
 * from Room objects, not duplicated here.
 *
 * @version 3.1
 */

public class RoomInventory {

    /**
     * Stores available room count for each room type
     * Key   → Room type name
     * Value → Available room count
     */
    private Map<String, Integer> roomAvailability;

    /** Constructor initializes the inventory with default values */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /**
     * Initializes room availability.
     * This method centralizes inventory setup.
     */
    private void initializeInventory() {

        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);

    }

    /** Returns the availability map */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * Updates availability for a specific room type
     * @param roomType room type name
     * @param count new availability count
     */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}
