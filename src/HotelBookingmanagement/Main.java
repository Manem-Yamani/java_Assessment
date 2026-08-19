package HotelBookingmanagement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Guest g1 = new Guest(1, "mini", "yamini@gmail.com", "Vizag", 23);
        Guest g2 = new Guest(2, "Navina", "jahnavi@hotmail.com", "Hyderabad", 30);
        Guest g3 = new Guest(3, "Anand", "anand@gmail.com", "Vizag", 35);
        Guest g4 = new Guest(4, "Lalli", "lalli@yahoo.com", "Chennai", 28);
        Guest g5 = new Guest(5, "Ravi", "ravi@hotmail.com", "Hyderabad", 40);
        Guest g6=new Guest(4, "Lalli", "lalli@yahoo.com", "Chennai", 28);

        List<Guest> guests = List.of(g1, g2, g3, g4, g5);

        Room r1 = new Room(101, "3BHK", 5000);
        Room r2 = new Room(102, "2BHK", 2500);
        Room r3 = new Room(103, "3BHK", 5000);

        Booking b1 = new Booking(1, g1, r1, 3);
        Booking b2 = new Booking(2, g2, r2, 2);
        Booking b3 = new Booking(3, g3, r1, 4);
        Booking b4 = new Booking(4, g4, r3, 1);

        List<Booking> bookings = new ArrayList<>(List.of(b1, b2, b3, b4));

        HotelOperations hotel = new HotelManagement();
        Database d1=new Database(bookings);
        Booking b5=new Booking(5, g5, r1, 2);
        System.out.println(hotel.getGuestNamesContaining(guests, "a"));

        System.out.println(hotel.getGuestEmailDomains(guests));

        System.out.println(hotel.getGuestName(guests, 25));

        System.out.println(hotel.countBookingsByRoomType(bookings));

        System.out.println(hotel.groupGuestsByCity(guests));
        d1.saveBooking(b5);
        System.out.println("bookings after adding b5 = "+bookings.size());
        System.out.println(d1.getBookingByGuest(g6));
        System.out.println(hotel.getGuestFieldvalues(guests,"city"));
    }
}
