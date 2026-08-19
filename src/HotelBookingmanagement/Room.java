package HotelBookingmanagement;

public class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    public Room(int roomNumber,String roomType,double pricePerNight){
        this.roomNumber=roomNumber;
        this.roomType=roomType;
        this.pricePerNight=pricePerNight;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public String getRoomType(){
        return roomType;
    }
    public double getPricePerNight(){
        return pricePerNight;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber=roomNumber;
    }
    public void setRoomType(String roomType){
        this.roomType=roomType;
    }
    public void setPricePerNight(double pricePerNight){
        this.pricePerNight=pricePerNight;
    }
    @Override
    public String toString(){
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType'" + roomType + '\'' +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}
