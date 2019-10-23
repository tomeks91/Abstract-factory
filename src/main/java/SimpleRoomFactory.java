public class SimpleRoomFactory extends RoomFactory {
    @Override
    protected Room createRoom() {
        return new SimpleRoom();
    }
}
