package pl.javastart.task;

public class Room {
    private int squareSurface;
    private double temperature;
    private double temperatureLimit;
    private boolean isAirconditioner;

    public Room(int squareSurface, double temperature, double temperatureLimit, boolean isAirconditioner) {
        this.squareSurface = squareSurface;
        this.temperature = temperature;
        this.temperatureLimit = temperatureLimit;
        this.isAirconditioner = isAirconditioner;
    }

    boolean lowertemperature() {
        boolean result;
        if (isAirconditioner) {
            if (temperature - temperatureLimit > 1) {
                temperature--;
                result = true;
            } else {
                temperature = temperatureLimit;
                result = false;
            }
        } else {
            result = false;
        }
        return result;
    }
}
