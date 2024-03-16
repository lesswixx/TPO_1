package task3;

public class Main {
    public static void main(String[] args) {
        Arthur arthur = new Arthur();
        Camera camera = new Camera();
        Console console = new Console();

        camera.turnOn();
        arthur.reactToCamera();
        arthur.moveToConsole();

        System.out.println(arthur.getFeeling());
        System.out.println("Arthur's position: " + arthur.getPosition());
        System.out.println("Camera status: " + camera.getStatus());
        System.out.println("Console status: " + console.getStatus());
    }
}
