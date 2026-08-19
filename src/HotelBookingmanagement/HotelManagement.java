package HotelBookingmanagement;
import java.util.*;
import java.util.stream.Collectors;

public class HotelManagement implements HotelOperations{
    public List<String> getGuestNamesContaining(List<Guest> guests, String keyWord){
        return guests.stream().map(Guest::getName).filter(i->i.toLowerCase().contains(keyWord.toLowerCase())).toList();
    }
    public Set<String> getGuestEmailDomains(List<Guest> guests){
return guests.stream().map(i->i.getEmail().substring(i.getEmail().indexOf('@')+1)).collect(Collectors.toSet());
    }
    public String getGuestName(List<Guest> guests, int age){
        return guests.stream().filter(a->a.getAge()>age).sorted(Comparator.comparing(Guest::getName)).skip(1).map(Guest::getName).findFirst().orElse(null);
    }
    public Map<String, Long> countBookingsByRoomType(List<Booking> bookings){
        return bookings.stream().collect(Collectors.groupingBy(b->b.getRoom().getRoomType(),Collectors.counting()));
    }
public Map<String, List<Guest>> groupGuestsByCity(List<Guest> guests){
        return guests.stream().collect(Collectors.groupingBy(Guest::getCity));
}
public List<String> getGuestFieldvalues(List<Guest> guests,String fieldName){
        return switch(fieldName){
            case "city"->guests.stream().map(Guest::getCity).toList();
            case "email"->guests.stream().map(Guest::getEmail).toList();
            case "name"->guests.stream().map(Guest::getName).toList();
            default -> throw new IllegalArgumentException("Invalid field: " + fieldName);
        };
}
}
