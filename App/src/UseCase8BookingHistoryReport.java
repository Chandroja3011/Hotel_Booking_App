/**
 * MAIN CLASS: UseCase8BookingHistoryReport
 *
 * Use Case 8: Booking History & Reporting
 *
 * Description:
 * Demonstrates storing and reporting
 * confirmed bookings.
 *
 * @version 8.0
 */

public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        BookingHistory history = new BookingHistory();

        // Simulate confirmed bookings
        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));

        BookingReportService reportService = new BookingReportService();

        reportService.generateReport(history);
    }
}