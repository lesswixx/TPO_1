package task3;

public class Camera {
    private String status = "off";

    public void turnOn() {
        this.status = "recording";
    }

    public String getStatus() {
        return this.status;
    }
}