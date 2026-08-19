package HotelBookingmanagement;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface HotelOperations {
    List<String> getGuestNamesContaining(List<Guest> guests, String keyWord);
    Set<String> getGuestEmailDomains(List<Guest> guests);
    String getGuestName(List<Guest> guests, int age);
    Map<String, Long> countBookingsByRoomType(List<Booking> bookings);
    Map<String, List<Guest>> groupGuestsByCity(List<Guest> guests);
    List<String> getGuestFieldvalues(List<Guest> guests,String fieldName);
}
