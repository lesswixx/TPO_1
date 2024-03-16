package task3;

public class Arthur {
    private int position = 0;
    private String feeling = "";

    public void moveToConsole() {
        this.position++;
        this.feeling = "Moving towards the console...";
    }

    public void reactToCamera() {
        this.feeling = "Feels a breeze on his incorporeal head...";
    }

    public String getFeeling() {
        return this.feeling;
    }

    public int getPosition() {
        return this.position;
    }
}