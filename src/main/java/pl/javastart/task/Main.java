package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(35, 23.8, 20.0, true);
        room.lowertemperature();
        room.lowertemperature();
        room.lowertemperature();
        room.lowertemperature();
        System.out.println(room.lowertemperature());
    }
}
