package RoomTypes;

public enum ConferenceRoomType {

    SMALL(5),
    MEDIUM(10),
    LARGE(20);

    private final int capacity;

    ConferenceRoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
