package task3;

public class Console {
    private String status = "idle";

    public void activate() {
        this.status = "active";
    }

    public String getStatus() {
        return this.status;
    }
}