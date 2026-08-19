package HotelBookingmanagement;

public class Booking {
    private int bookingId;
    private Guest guest;
    private Room room;
    private int numberOfNights;
    public Booking(int bookingId,Guest guest,Room room,int numberOfNights){
        this.bookingId=bookingId;
        this.guest=guest;
        this.room=room;
        this.numberOfNights=numberOfNights;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public void setGuest(Guest guest){
        this.guest=guest;
    }
    public void setRoom(Room room){
        this.room=room;
    }
    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights=numberOfNights;
    }
    public int getBookingId(){
        return bookingId;
    }
    public Guest getGuest(){
        return guest;
    }
    public Room getRoom(){
        return room;
    }
    public int getNumberOfNights(){
        return numberOfNights;
    }
    @Override
    public String toString(){
        return "Booking{" +
                "bookingId=" + bookingId +
                ", guest=" + guest +
                ", room=" + room +
                '}';
    }
}
