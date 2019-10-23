import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        AdvancedRoomFactory advancedRoomFactory = new AdvancedRoomFactory();
        List<Room> rooms = new ArrayList<>();
        rooms.add(advancedRoomFactory.createRoom());
        rooms.add(advancedRoomFactory.createRoom());
    }
}