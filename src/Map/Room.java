package Map;

public class Room {
    private String roomName;
    private String room;
    private String door;
    private boolean doorOpen = false;
    private Room nextRoom;

    public Room (String roomName, String door){
        this.roomName = roomName;
        this.door = door;
    }

    public Room enterDoor(String door){
        if (this.door.equalsIgnoreCase(door)){
            return nextRoom;
        }
        return this;
    }

        public void setNextRoom(Room nextRoom){
        this.room = room;
        }

        public String getdoor(){
        return door;
        }
    }



