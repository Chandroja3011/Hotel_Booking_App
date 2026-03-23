import java.util.*;

/**
 * CLASS: AddOnServiceManager
 *
 * Use Case 7: Add-On Service Selection
 *
 * Description:
 * Manages optional services associated
 * with confirmed reservations.
 *
 * Supports multiple services per reservation.
 *
 * @version 7.0
 */

public class AddOnServiceManager {

    /**
     * Maps reservation ID to selected services
     * Key -> Reservation ID
     * Value -> List of services
     */
    private Map<String, List<AddOnService>> servicesByReservation;

    /** Initializes service manager */
    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    /**
     * Adds a service to a reservation
     */
    public void addService(String reservationId, AddOnService service) {

        servicesByReservation
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);
    }

    /**
     * Calculates total service cost
     */
    public double calculateTotalServiceCost(String reservationId) {

        double total = 0;

        List<AddOnService> services =
                servicesByReservation.get(reservationId);

        if (services != null) {
            for (AddOnService service : services) {
                total += service.getCost();
            }
        }

        return total;
    }
}