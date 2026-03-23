import java.util.ArrayList;
import java.util.List;

/**
 * CLASS: BookingHistory
 *
 * Use Case 8: Booking History & Reporting
 *
 * Description:
 * Maintains a record of confirmed reservations.
 * Provides ordered storage for reporting purposes.
 *
 * @version 8.0
 */

public class BookingHistory {

    /** List storing confirmed reservations */
    private List<Reservation> confirmedReservations;

    /** Initializes empty booking history */
    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    /**
     * Adds a confirmed reservation
     * @param reservation confirmed booking
     */
    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    /**
     * Returns all confirmed reservations
     * @return list of reservations
     */
    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}
