package HotelBookingmanagement;

import java.util.List;

public class Database {
    private List<Booking> bookings;
    Database(List<Booking> bookings){
        this.bookings=bookings;
    }
    void saveBooking(Booking booking){
        bookings.add(booking);
    }
    Booking getBookingByGuest(Guest guest){
return bookings.stream().filter(b->b.getGuest().equals(guest)).findFirst().orElse(null);
    }

}
