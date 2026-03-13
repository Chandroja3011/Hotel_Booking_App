/**
 * MAIN CLASS: UseCase6RoomAllocationService
 *
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Description:
 * This class demonstrates how booking
 * requests are confirmed and rooms
 * are allocated safely.
 *
 * Booking requests are processed in FIFO order.
 *
 * @version 6.0
 */

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        RoomInventory inventory = new RoomInventory();

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        RoomAllocationService allocationService =
                new RoomAllocationService();

        // create booking requests
        bookingQueue.addRequest(new Reservation("Abhi", "Single"));
        bookingQueue.addRequest(new Reservation("Subha", "Single"));
        bookingQueue.addRequest(new Reservation("Vanmathi", "Suite"));

        // process requests FIFO
        while (bookingQueue.hasPendingRequests()) {

            Reservation reservation =
                    bookingQueue.getNextRequest();

            allocationService.allocateRoom(
                    reservation,
                    inventory
            );
        }
    }
}