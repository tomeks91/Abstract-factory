public class AdvancedRoomFactory extends RoomFactory {
    @Override
    protected Room createRoom() {
        return new AdvancedRoom();
    }
}
