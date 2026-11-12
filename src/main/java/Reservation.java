public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public int getNumberOfNights(){
        return numberOfNights;
    }
    public boolean isWeekend(){
        return weekend;
    }
    public void setWeekend(boolean weekend){
        this.weekend = weekend;
    }
    public double getReservationTotal(){
        //need number of nights and room type

        return getReservationTotal();
    }


}
