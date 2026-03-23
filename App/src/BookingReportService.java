/**
 * CLASS: BookingReportService
 *
 * Use Case 8: Booking History & Reporting
 *
 * Description:
 * Generates reports from booking history.
 * Keeps reporting logic separate from storage.
 *
 * @version 8.0
 */

public class BookingReportService {

    /**
     * Displays a summary report
     * @param history booking history
     */
    public void generateReport(BookingHistory history) {

        System.out.println("Booking History Report");

        for (Reservation r : history.getConfirmedReservations()) {

            System.out.println(
                    "Guest: " + r.getGuestName()
                            + ", Room Type: " + r.getRoomType()
            );
        }
    }
}