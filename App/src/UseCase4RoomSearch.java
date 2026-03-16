public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("Room Search\n");

        // Initialize room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Setup inventory
        RoomInventory inventory = new RoomInventory();
        inventory.addRooms("Single", 5);
        inventory.addRooms("Double", 3);
        inventory.addRooms("Suite", 2);

        // Search service
        RoomSearchService service = new RoomSearchService();

        // Display available rooms
        service.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}